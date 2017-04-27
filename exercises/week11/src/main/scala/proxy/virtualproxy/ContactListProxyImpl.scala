package main.scala.proxy.virtualproxy

import scala.collection.mutable.ListBuffer

/**
  * Created by jakeholdom on 25/04/2017.
  */

class ContactListProxyImpl extends ContactList {

  private var contactList: ContactList = _

  override def employeeList: ListBuffer[Employee] = {
    if (contactList == null){
      println("Creating contact list and fetching list of employees...")
      contactList = ContactListImpl()
    }

    contactList.employeeList
  }

}
