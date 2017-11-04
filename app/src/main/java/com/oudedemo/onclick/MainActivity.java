package com.oudedemo.onclick;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity implements OnClickListener
{
    //声明4个按钮对象和1个TextView对象
    private Button bn1,bn2,bn3,bn4;
    private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //按钮对象绑定界面按钮控件
        bn1=(Button) findViewById(R.id.mainButton1);
        bn2=(Button) findViewById(R.id.mainButton2);
        bn3=(Button) findViewById(R.id.mainButton3);
        bn4=(Button) findViewById(R.id.mainButton4);
        tx=(TextView) findViewById(R.id.mainTextView1);
        
        /* 方法一：匿名内部类方式   */
        bn1.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                  tx.setText("匿名内部类方式实现");
                }
            });
        /*  方法一结束  */
        
        //方法二执行
        bn2.setOnClickListener(this);
        
        //方法三执行
        bn3.setOnClickListener(new MyClickListener());
        
    }
    
    /*  方法二：Activity继承View.OnClickListener  */
    @Override
    public void onClick(View p1)
    {
        tx.setText("Activity继承OnClickListener方式");
    } 
    
    /*   方法二结束 */
    
    /*   方法三：自定义点击事件监听类 */
    class MyClickListener implements OnClickListener
    {
        @Override
        public void onClick(View p1)
        {
           tx.setText("自定义点击事件监听类实现");
        }      
    }
    /*  方法三结束  */
    
    /*  方法四:onClick属性发射调用Click方法实现 */
    public void Click(View v) {
        tx.setText("onClick属性发射调用Click方法实现");
    }
    /*  方法四结束  */
}
