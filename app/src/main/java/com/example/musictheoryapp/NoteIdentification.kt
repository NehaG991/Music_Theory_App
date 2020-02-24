package com.example.musictheoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class NoteIdentification : AppCompatActivity() {

    lateinit var noteImage: ImageView
    lateinit var answerTextView: TextView
    val questionsDone = 0
    var correctAnswer = 2;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_identification)
        noteImage = findViewById(R.id.noteImageView)
        answerTextView = findViewById(R.id.answerBox)

        // c button click listener
        val cButton: Button = this.findViewById(R.id.cButton)
        cButton.setOnClickListener{
            if (correctAnswer == 2 || correctAnswer == 8){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // d button listen
        val dButton: Button = this.findViewById(R.id.dButton)
        dButton.setOnClickListener{
            if (correctAnswer == 3 || correctAnswer == 9){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // e button listener
        val eButton: Button = this.findViewById(R.id.eButton)
        eButton.setOnClickListener{
            if (correctAnswer == 4 || correctAnswer == 10){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // f button listener
        val fButton: Button = this.findViewById(R.id.fButton)
        fButton.setOnClickListener{
            if (correctAnswer == 5 || correctAnswer == 11){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // g button listener
        val gButton: Button = this.findViewById(R.id.gButton)
        gButton.setOnClickListener{
            if (correctAnswer == 6 || correctAnswer == 12){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // a button listener
        val aButton: Button = this.findViewById(R.id.aButton)
        aButton.setOnClickListener{
            if (correctAnswer == 7 || correctAnswer == 0){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // b button listener
        val bButton: Button = this.findViewById(R.id.bButton)
        bButton.setOnClickListener{
            if (correctAnswer == 1){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // c# button listener
        val cSButton: Button = this.findViewById(R.id.cSharpButton)
        cSButton.setOnClickListener{
            if (correctAnswer == 18 || correctAnswer == 27){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // d# button listener
        val dSButton: Button = this.findViewById(R.id.dSharpButton)
        dSButton.setOnClickListener{
            if (correctAnswer == 19 || correctAnswer == 28){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // f# button listener
        val fSButton: Button = this.findViewById(R.id.fSharpButton)
        fSButton.setOnClickListener{
            if (correctAnswer == 20 || correctAnswer == 29){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // g# button listener
        val gSButton: Button = this.findViewById(R.id.gSharpButton)
        gSButton.setOnClickListener{
            if (correctAnswer == 21 || correctAnswer == 30){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // a sharp listener
        val aSButton: Button = this.findViewById(R.id.aSharpButton)
        aSButton.setOnClickListener{
            if (correctAnswer == 26){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // d flat listener
        val dBButton: Button = this.findViewById(R.id.dFlatButton)
        dBButton.setOnClickListener{
            if (correctAnswer == 15 || correctAnswer == 23){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // e flat listener
        val eBButton: Button = this.findViewById(R.id.eFlatButton)
        eBButton.setOnClickListener{
            if (correctAnswer == 16 || correctAnswer == 24){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // g flat listener
        val gBButton: Button = this.findViewById(R.id.gFlatButton)
        gBButton.setOnClickListener{
            if (correctAnswer == 17 || correctAnswer == 25){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // a flat listener
        val aBButton: Button = this.findViewById(R.id.aFlatButton)
        aBButton.setOnClickListener{
            if (correctAnswer == 13 || correctAnswer == 22){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        // b flat listener
        val bBButton: Button = this.findViewById(R.id.bFlatButton)
        bBButton.setOnClickListener{
            if (correctAnswer == 14){
                answerTextView.setText("Right!")
            }
            else {
                answerTextView.setText("Wrong!")
            }
            questions()
        }

        val skipButton: Button = this.findViewById(R.id.skipButton)
        skipButton.setOnClickListener{
            questions()
        }

    }

    // generates random notes on button click
    private fun questions() {
        //questionsDone.inc()
        //answerTextView.setText("")
        val randomQuestion = Random().nextInt(31)
                correctAnswer = randomQuestion
            val drawableResource = when (randomQuestion) {
                0 -> R.drawable.line_a
                1 -> R.drawable.line_b
                2 -> R.drawable.line_c
                3 -> R.drawable.line_d
                4 -> R.drawable.line_e
                5 -> R.drawable.line_f
                6 -> R.drawable.line_g
                7 -> R.drawable.space_a
                8 -> R.drawable.space_c
                9 -> R.drawable.space_d
                10 -> R.drawable.space_e
                11 -> R.drawable.space_f
                12 -> R.drawable.space_g
                13 -> R.drawable.line_a_flat
                14 -> R.drawable.line_b_flat
                15 -> R.drawable.line_d_flat
                16 -> R.drawable.line_e_flat
                17 -> R.drawable.line_g_flat
                18 -> R.drawable.line_c_sharp
                19 -> R.drawable.line_d_sharp
                20 -> R.drawable.line_f_sharp
                21 -> R.drawable.line_g_sharp
                22 -> R.drawable.space_a_flat
                23 -> R.drawable.space_d_flat
                24 -> R.drawable.space_e_flat
                25 -> R.drawable.space_g_flat
                26 -> R.drawable.space_a_sharp
                27 -> R.drawable.space_c_sharp
                28 -> R.drawable.space_d_sharp
                29 -> R.drawable.space_f_sharp
                else -> R.drawable.space_g_sharp
            }
            noteImage.setImageResource(drawableResource)


    }
}