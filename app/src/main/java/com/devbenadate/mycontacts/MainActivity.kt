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
        var Contact1=Contact("Babara","0976565555","gggtanuijacklinee@gmail.com","697 karen","https://images.theconversation.com/files/344021/original/file-20200625-33550-ko05k3.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=1200.0&fit=crop")
        var Contact2=Contact("Paul","09765655677","cjljljlanuijacklinee@gmail.com","608 karen","https://penntoday.upenn.edu/sites/default/files/2021-08/St.%20Julian-Varnon-headshot_MAIN.jpg")
        var Contact3=Contact("President","09765655475","kgkgtanuijacklinee@gmail.com","898 Uganda","https://tokyo.mofa.go.ug/files/images/President-Yoweri-Museveni-signs.gif")
        var Contact4=Contact("sarah","09765655495","rttyanuijacklinee@gmail.com","606 karen","https://cdn.britannica.com/41/161741-050-274BE952/man-African-American-water-cooler-people-Oklahoma-1939.jpg")
        var Contact5=Contact("sarah T","09765655495","rttyanuijacklinee@gmail.com","606 karen","https://cdn.vox-cdn.com/thumbor/v7HjYONlHfdaUJRW4bZOxNvYm1A=/0x231:2456x2073/1400x788/filters:focal(0x231:2456x2073):format(jpeg)/cdn.vox-cdn.com/uploads/chorus_image/image/44255874/458999260.0.jpg")
        var contactList = listOf(Contact1,Contact2,Contact3,Contact4,Contact5)
        var contactAdapter=ContactsRvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter



    }
}