package br.ifam.programaaiapp.fragments;

import android.content.ContentValues;
import android.content.DialogInterface;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.util.TypedValue;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;

import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

import br.ifam.programaaiapp.R;
import br.ifam.programaaiapp.models.DatabaseHelper;


public class CronogramaFragment extends Fragment{

    private TextView textdata, textEvent, textEventoAdd, textDataadd;
    private CalendarView calendarView;
    private View root;
    private Button addEvent;
    private String selectData, day;
    private SimpleDateFormat dateFormat;
    private ScrollView scrollView;

    private DatabaseHelper databaseHelper;

    private static final String EVENT_PREFS_KEY = "event_prefs";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        databaseHelper = new DatabaseHelper(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       root = inflater.inflate(R.layout.fragment_cronograma, container, false);
       calendarView = root.findViewById(R.id.calendarView);
       textEvent = root.findViewById(R.id.evento);
       addEvent = root.findViewById(R.id.addEvent);
       scrollView = root.findViewById(R.id.scrollView);

        dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

        calendarView.setWeekDayTextAppearance(R.style.CustomCalendarViewDayText);
        calendarView.setDateTextAppearance(R.style.CustomCalendarViewDayText);
        calendarView.setFirstDayOfWeek(R.style.CustomCalendarViewDayText);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
               selectData = dateFormat.format(new Date(year - 1900, month, dayOfMonth));

               day = dateFormat.format(dayOfMonth);

               loadEventForSelectedDate();

           }
       });

        addEvent.setOnClickListener(view -> {
            String event = textEvent.getText().toString().trim();
            if(event.isEmpty()){
                Toast.makeText(getActivity(), "Digite um Evento!", Toast.LENGTH_SHORT).show();
            }else if(selectData == null){
                Toast.makeText(getActivity(), "Selecione uma Data!!\nAperte novamente na data!", Toast.LENGTH_SHORT).show();
            } else {
                newTextViewEvento();
            }
        });

        // Adiciona um listener de foco ao campo textEvent
        textEvent.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // Se perdeu o foco, limpa o texto do campo
                    textEvent.setText("");
                }
            }
        });


       return root;
    }


    private void loadEventForSelectedDate() {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM events WHERE date = ?", new String[]{selectData});

        LinearLayout eventContainer = root.findViewById(R.id.eventContainer);
        eventContainer.removeAllViews(); // Limpa os eventos anteriores

        int eventColumnIndex = cursor.getColumnIndex("event"); // Índice da coluna "event"
        int eventIdColumnIndex = cursor.getColumnIndex("id"); // Índice da coluna "id"

        while (cursor.moveToNext()) {
            String event = cursor.getString(eventColumnIndex);
            int eventId = cursor.getInt(eventIdColumnIndex);

            // Criar um novo TextView com a data e o evento
            TextView newEventTextView = new TextView(getActivity());
            newEventTextView.setText(" " + selectData + " : " + event);
            newEventTextView.setTextColor(getResources().getColor(R.color.roxo_mtclaro));
            newEventTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            newEventTextView.setPadding(20, 25, 0, 0);

            // Aplicar a fonte personalizada ao TextView
            Typeface minhaFonte = ResourcesCompat.getFont(getActivity(), R.font.sourcecode);
            newEventTextView.setTypeface(minhaFonte);

            // Adicionar o ícone drawable ao TextView
            Drawable iconDrawable = getResources().getDrawable(R.drawable.ic_notification);
            newEventTextView.setCompoundDrawablesWithIntrinsicBounds(iconDrawable, null, null, null);

            // Gerar um ID único para o TextView
            int uniqueId = View.generateViewId();
            newEventTextView.setId(uniqueId);

            // Armazenar o ID do evento como uma tag do TextView
            newEventTextView.setTag(eventId);

            // Adicionar o novo TextView ao contêiner de eventos
            eventContainer.addView(newEventTextView);

            // Adicionar um ouvinte de clique para excluir o evento
            newEventTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int eventId = (int) view.getTag();
                    showDeleteConfirmationDialog(eventId);
                }
            });
        }

        cursor.close();
        db.close();
    }

    private void deleteEvent(int eventId) {
        // Excluir o evento do banco de dados
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        db.delete("events", "id = ?", new String[]{String.valueOf(eventId)});
        db.close();

        // Remover o TextView do contêiner de eventos
        LinearLayout eventContainer = root.findViewById(R.id.eventContainer);
        View eventView = eventContainer.findViewWithTag(eventId);
        if (eventView != null) {
            eventContainer.removeView(eventView);
        }

        Toast.makeText(getActivity(), "Evento excluído", Toast.LENGTH_SHORT).show();

        // Atualizar a exibição dos eventos
        loadEventForSelectedDate();
    }

    private void showDeleteConfirmationDialog(int eventId) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.PurpleAlertDialog);
        builder.setTitle(Html.fromHtml("<font color='#8a61e9'>Excluir Evento: </font>"))
                .setIcon(R.drawable.ic_delete)
                .setMessage(Html.fromHtml("<font color='#AB8EEF'>Deseja excluir este evento?</font>"))
                .setPositiveButton("Excluir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        deleteEvent(eventId);
                    }
                })
                .setNegativeButton("Cancelar", null)
                .show();
    }

    private void newTextViewEvento() {
        String event = textEvent.getText().toString().trim();

        // Salvar o evento no banco de dados
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("date", selectData);
        values.put("event", event);
        long eventId = db.insert("events", null, values);
        db.close();

        Toast.makeText(getActivity(), "Evento adicionado: " + event + " - " + selectData, Toast.LENGTH_SHORT).show();
        textEvent.setText("");

        // Carregar a fonte personalizada
        Typeface minhaFonte = ResourcesCompat.getFont(getActivity(), R.font.sourcecode);

        // Criar um novo TextView com a data e o evento
        TextView newEventTextView = new TextView(getActivity());
        newEventTextView.setText(" " + selectData +" : "+ event);
        newEventTextView.setTextColor(getResources().getColor(R.color.roxo_mtclaro));
        newEventTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        newEventTextView.setPadding(20, 25, 0, 0);

        // Aplicar a fonte personalizada ao TextView
        newEventTextView.setTypeface(minhaFonte);

        // Adicionar o ícone drawable ao TextView
        Drawable iconDrawable = getResources().getDrawable(R.drawable.ic_notification);
        newEventTextView.setCompoundDrawablesWithIntrinsicBounds(iconDrawable, null, null, null);

        // Adicionar o novo TextView ao contêiner de eventos
        LinearLayout eventContainer = root.findViewById(R.id.eventContainer);
        eventContainer.addView(newEventTextView);

        // Definir um OnClickListener para o TextView
        newEventTextView.setOnClickListener(view -> {
            int clickedEventId = (int) view.getTag();
            showDeleteConfirmationDialog(clickedEventId);
        });

        // Armazenar o ID do evento como uma tag do TextView
        newEventTextView.setTag((int) eventId);
    }



}