package com.devbenadate.mycontacts

import android.provider.ContactsContract
import java.net.Inet4Address

data class Contact(
    var name: String,
    var phoneNumber: String,
    var email: String,
    var address: String,
    var image:String
)
