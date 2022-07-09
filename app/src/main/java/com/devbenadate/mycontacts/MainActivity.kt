package com.devbenadate.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.devbenadate.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun  displayContacts(){
        var Contact1=Contact("Babara","0976565555","gggtanuijacklinee@gmail.com","697 karen","")
        var Contact2=Contact("Paul","09765655677","cjljljlanuijacklinee@gmail.com","608 karen","")
        var Contact3=Contact("mercy","09765655475","kgkgtanuijacklinee@gmail.com","898 karen","")
        var Contact4=Contact("sarah","09765655495","rttyanuijacklinee@gmail.com","606 karen","")
        var contactList = listOf(Contact1,Contact2,Contact3,Contact4)
        var contactAdapter=ContactsRvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter



    }
}