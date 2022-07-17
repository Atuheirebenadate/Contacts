package com.devbenadate.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.devbenadate.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactsRvAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactViewHolder=ContactsViewHolder(binding)
        return contactViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {

        var currentContact = contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        holder.binding.tvNumber.text=currentContact.phoneNumber

        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(300,300)
            .centerCrop()
            .into(holder.binding.imgcontact)
        var context=holder.itemView.context
        holder.binding.idContact.setOnClickListener(){
            Toast.makeText( context,"you have clicked on ${currentContact.name}'s the image",Toast.LENGTH_SHORT).show()
        }
        holder.binding.idContact.setOnClickListener{
        val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("IMAGE",currentContact.image)
        context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return contactList.size
    }


}
class ContactsViewHolder( var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root){


}