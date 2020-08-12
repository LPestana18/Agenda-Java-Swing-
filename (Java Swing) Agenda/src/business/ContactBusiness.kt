package business

import Entity.ContactEntity
import Repository.ContactRepository
import java.lang.Exception

class ContactBusiness {

    private fun validate(name: String, phone: String) {
        if (name == "" || name == " "){
            throw Exception ("Nome é obrigatório!")
        }
        if (phone == "" || phone == " ") {
            throw Exception ("Telefone é obrigatório!")
        }
    }

    private fun validateDelete(name: String, phone: String) {
        if(name == "" || phone == "") {
            throw Exception ("É necessário selecionar uum contato antes de remover.")
        }
    }

    fun getContactCountDescrition(): String {
        val list = getList()
        return when {
            list.isEmpty() -> "0 contatos"
            list.size == 1 -> "1 contato"
            else -> "${list.size} contatos"
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList() : List<ContactEntity> {
        return ContactRepository.getList()
    }
}