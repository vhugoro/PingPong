package br.com.vh.pingpong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PlacarActivity : AppCompatActivity() {
    var scorePlayer1 = 0
    var scorePlayer2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)
    }
}
