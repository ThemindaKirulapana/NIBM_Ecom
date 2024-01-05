public class Parent {

    private String Parent_name;
    private Long Parent_contact;

    public Parent(String parentName, Long parentContact) {

        this.Parent_name=parentName;
        this.Parent_contact=parentContact;

    }

    //setters & Getters
    public String getParent_name() {
        return Parent_name;
    }

//    public void setParent_name(String parent_name) {
//        Parent_name = parent_name;
//    }

    public Long getParent_contact() {
        return Parent_contact;
    }

//    public void setParent_contact(Long parent_contact) {
//        Parent_contact = parent_contact;
//    }
}
