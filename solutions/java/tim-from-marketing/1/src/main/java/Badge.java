class Badge {
    public String print(Integer id, String name, String department) {
        if(department == null)
        {
            department = "OWNER";
        }
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        else if(name == null)
        {
            return "[" + id + "]" + " - " + department.toUpperCase();
        }
        else 
        {
            return "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
        }
    }
}
