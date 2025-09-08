package br.ifam.programaaiapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.CSharpActivity;
import br.ifam.programaaiapp.CssActivity;
import br.ifam.programaaiapp.FluxoActivity;
import br.ifam.programaaiapp.HtmlActivity;
import br.ifam.programaaiapp.JavaActivity;
import br.ifam.programaaiapp.PhpActivity;
import br.ifam.programaaiapp.PhytonActivity;
import br.ifam.programaaiapp.PortugolActivity;
import br.ifam.programaaiapp.R;

public class StudyFragment extends Fragment {

    View root;
    LinearLayout portugol, java, css, c, phyton, html, fluxo, php;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_study, container, false);

        portugol = root.findViewById(R.id.layoutPortugol);
        java = root.findViewById(R.id.layoutJava);
        c = root.findViewById(R.id.layoutC);
        phyton = root.findViewById(R.id.layoutPhyton);
        html = root.findViewById(R.id.layoutHtml);
        css = root.findViewById(R.id.layoutCss);
        php = root.findViewById(R.id.layoutPhp);
        fluxo = root.findViewById(R.id.layoutFluxo);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.layoutPortugol:
                        startActivity(new Intent(getContext(), PortugolActivity.class));
                        break;
                    case R.id.layoutJava:
                        startActivity(new Intent(getContext(), JavaActivity.class));
                        break;
                    case R.id.layoutC:
                        startActivity(new Intent(getContext(), CSharpActivity.class));
                        break;
                    case R.id.layoutPhyton:
                        startActivity(new Intent(getContext(), PhytonActivity.class));
                        break;
                    case R.id.layoutHtml:
                        startActivity(new Intent(getContext(), HtmlActivity.class));
                        break;
                    case R.id.layoutCss:
                        startActivity(new Intent(getContext(), CssActivity.class));
                        break;
                    case R.id.layoutPhp:
                        startActivity(new Intent(getContext(), PhpActivity.class));
                        break;
                    case R.id.layoutFluxo:
                        startActivity(new Intent(getContext(), FluxoActivity.class));
                        break;
                }
            }
        };

        portugol.setOnClickListener(onClickListener);
        java.setOnClickListener(onClickListener);
        c.setOnClickListener(onClickListener);
        phyton.setOnClickListener(onClickListener);
        html.setOnClickListener(onClickListener);
        css.setOnClickListener(onClickListener);
        php.setOnClickListener(onClickListener);
        fluxo.setOnClickListener(onClickListener);

        return root;
    }

}