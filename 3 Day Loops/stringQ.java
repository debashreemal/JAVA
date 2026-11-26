public class stringQ {
    public static void main(String[] args) {
        String name = "Debashree"; //string
        String course = new String("Java"); //object

        System.out.println(name);
        System.out.println(course);

        System.out.println(name.length()); 
        System.out.println(name.charAt(0)); 
        System.out.println(name.toUpperCase()); 
        System.out.println(name.toLowerCase()); 
        System.out.println(name.substring(2)); 
        System.out.println(name.substring(1, 4)); 
        System.out.println(name.contains("ee")); 
        System.out.println(name.equals("Deb")); 
        System.out.println(name.equalsIgnoreCase("Deb")); 
        System.out.println(name.trim()); 

        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b); //compare objects -> false
        System.out.println(a.equals(b)); //compare characters -> true
        
        //String concatenation
        String message = "Name: " + name + " " + "Course" + course;
        System.out.println(message);
    }
}
