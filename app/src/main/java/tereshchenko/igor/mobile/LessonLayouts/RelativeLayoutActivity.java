package tereshchenko.igor.mobile.LessonLayouts;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity{

    public void onClick(Bundle stage)
    {
        super.onCreate(stage);

        setContentView(getRelativeLayout(this));

    }

    protected View getRelativeLayout(Context context){
        RelativeLayout layout=new RelativeLayout(context);

        layout.setMinimumHeight(300);
        layout.setMinimumWidth(300);

        EditText txtName=new EditText(context);
        txtName.setId(1);


        TextView lblName=new TextView(context);
        lblName.setId(2);
        lblName.setText("Name: ");


        Button btnSend=new Button(context);
        lblName.setId(3);
        btnSend.setText("Send");


        RelativeLayout.LayoutParams lblLayoutParameters= new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        lblLayoutParameters.addRule(RelativeLayout.CENTER_VERTICAL);

        lblName.setLayoutParams(lblLayoutParameters);



        RelativeLayout.LayoutParams txtLayoutParameters = new RelativeLayout.LayoutParams(400, ViewGroup.LayoutParams.WRAP_CONTENT);


        txtLayoutParameters.addRule(RelativeLayout.ALIGN_BASELINE,lblName.getId());
        txtLayoutParameters.addRule(RelativeLayout.RIGHT_OF,lblName.getId());
        txtLayoutParameters.addRule(RelativeLayout.ALIGN_PARENT_END);

        txtName.setLayoutParams(txtLayoutParameters);

        RelativeLayout.LayoutParams btnLayoutParemeters=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnLayoutParemeters.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnLayoutParemeters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        btnLayoutParemeters.setMargins(40,40,40,40);

        layout.addView(txtName);
        layout.addView(lblName);
        layout.addView(btnSend);


        return layout;

    }
}
