package org.example;

import org.example.classes.AppUser;
import org.example.classes.Person;
import org.example.classes.ToDoItemDetail;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        Person nisse = new Person();
        System.out.println( "Lets go" );
        nisse.setId(1);
        nisse.setFirstName("Nisse");
        nisse.setLastName("Nilsson");
        Person bengt = new Person(2, "Bengt", "Bengtsson", "bengt@bungt.se");

        System.out.println(nisse.getDescription());
        System.out.println(bengt.getDescription());
        ToDoItemDetail aToDoFirst = new ToDoItemDetail(1,"Vattna palmerna", LocalDate.of(2022, 5, 22));

        //        ToDoItem aToDoFirst = new ToDoItem(1,"Vattna palmerna", null);
        AppUser user = new AppUser("Greg", "1234", AppUser.AppRole.ROLE_APP_USER);
        System.out.println(user);

    }

}
