package app.test.mygridview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var names = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val gridView = findViewById<GridView>(R.id.gridView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, names[position], Toast.LENGTH_SHORT).show()
        }
    }
}