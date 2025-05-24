
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileOptions {
   private Scanner x;
   private boolean found = false;
   
   //CheckLogin
   public boolean checkLogin(String username, String password, String filepath) {
       String login_username = null, login_password = null;
        found = false;
       try {
           x = new Scanner(new File(filepath)); //login.txt
           x.useDelimiter("[,]");
           
           while(x.hasNext() && !found)
           {
               login_username = x.next(); 
               login_password = x.next();
               
               
               //checking username and password...
               if(login_username.equals(username) && login_password.equals(password)){
                   found = true;
               }
           }    
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Something Went Wrong!");
       }
       
       x.close();
       
       
       return found;
   }
   
   public static void deleteFile(){
       File obj = new File("record.txt");
       obj.delete(); 
   }
   
   public static void saveData(Node s,String filepath){
       try {
           FileWriter fw = new FileWriter(filepath, true); ///RECORD.TXT
           //Writing Data in file
           fw.write(s.ID + "," + s.fullName + "," + s.age + "," + s.contact + "," + s.department + "," + s.semester + "," + s.section + "\n");
           
           fw.close();
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Error In Customer File");
           }
   }
     
}


