package com.bodiewebdesign.funfacts
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class FunFactsActivity : AppCompatActivity() {
    private val TAG = FunFactsActivity::class.java.simpleName

    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    // Declare our View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        /*val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("facts").child("fact")
        //Log.d(TAG, "Test --- myRef is " + myRef)
        //Log.d(TAG, "Test --- myRef.child() is " + myRef.child("1"))
        myRef.addListenerForSingleValueEvent(object: ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                //val value = dataSnapshot.getValue(String::class.java)
                //Log.d(TAG, "Test --- value is: " + value)
                for (ds in dataSnapshot.getChildren()) {
                    val point = ds.getKey()
                    Log.d("TAG", "Test --- " + point)
                }
            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Test --- Failed to read value.", error.toException())
            }
        })*/
        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById<TextView>(R.id.factTextView) as TextView
        showFactButton = findViewById<Button>(R.id.showFactButton) as Button
        relativeLayout = findViewById<RelativeLayout>(R.id.relativeLayout) as RelativeLayout
        showFactButton!!.setOnClickListener{
            val fact = factBook.getFact()
            val color = colorWheel.getColor()
            // Update the screen with our new fact
            factTextView!!.text = fact
            factTextView!!.setScaleX(0F)
            factTextView!!.setScaleY(0F)
            factTextView!!.animate().setDuration(1500L).scaleX(1.0F).scaleY(1.0F).start()
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }
    }


}
