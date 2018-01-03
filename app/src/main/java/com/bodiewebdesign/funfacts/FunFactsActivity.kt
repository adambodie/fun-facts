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
import java.util.*


class FunFactsActivity : AppCompatActivity() {
    private val TAG = FunFactsActivity::class.java.simpleName

    private val colorWheel = ColorWheel()
    // Declare our View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        val database = FirebaseDatabase.getInstance()
        val myRef = database.reference.child("facts")
        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById<TextView>(R.id.factTextView) as TextView
        showFactButton = findViewById<Button>(R.id.showFactButton) as Button
        relativeLayout = findViewById<RelativeLayout>(R.id.relativeLayout) as RelativeLayout

        showFactButton!!.setOnClickListener{
            val randomGenerator = Random()
            val randomNumber = randomGenerator.nextInt(20)
            myRef.child(randomNumber.toString()).addValueEventListener(object: ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val randomFact = dataSnapshot.getValue(Fact::class.java)
                    val value = randomFact!!.fact
                    factTextView!!.text = value
                    factTextView!!.alpha = 0F
                    factTextView!!.scaleX = 0F
                    factTextView!!.scaleY = 0F
                    factTextView!!.animate().setDuration(1500L).scaleX(1.0F).scaleY(1.0F).alphaBy(1.0F)
                            .start()
                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(TAG, "Failed to read value.", error.toException())
                }
            })
            val color = colorWheel.getColor()
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }
    }


}
