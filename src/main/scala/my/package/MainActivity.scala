package my.scala.app

import android.os.Bundle
import android.view.Menu
;

class MainActivity extends TypedActivity {

  override protected def onCreate( savedInstanceState:Bundle) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    val tv = findView(TR.text_view)
    tv.setText("Super scala app !!!")
  }

  override protected def onCreateOptionsMenu(menu:Menu) = {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    true
  }

}
