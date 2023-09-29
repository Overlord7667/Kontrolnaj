package com.betelgeuse.corp.kontrolnaj;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {
    private final String message;
    private final Game2 game2;
    public WinDialog(@NonNull Context context, String message, Game2 game2) {
        super(context);
        this.message = message;
        this.game2 = game2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_dialog_layout);

        final TextView messageText = findViewById(R.id.messageText);
        final Button startAgainBtn = findViewById(R.id.startAgainBtn);
        messageText.setText(message);

        startAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game2.restartMatch();
                dismiss();
            }
        });
    }
}
