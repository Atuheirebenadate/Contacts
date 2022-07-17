package com.devbenadate.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devbenadate.mycontacts.databinding.ActivityViewContactBinding
import com.devbenadate.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras= intent.extras
        val name=extras?.getString("NAME","")
        val email=extras?.getString("EMAIL","")
        val phone=extras?.getString("PHONENUMBER","")
        val address=extras?.getString("ADDRESS","")
        val image=binding.imgUser
        Toast.makeText(this,"$name: $email",Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvAddress1.text=address
        binding.tvPhonenumb.text=phone
        binding.tvEmail1.text=email
        binding.tvName1.text=name
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)


    }
}