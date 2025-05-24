
import javax.swing.JOptionPane;

public class DataHandler {
    
    private static AVLTree tree = new AVLTree();
    
    static void insert(Student s){
        tree.root = tree.insert(tree.root, s, s.ID);
    }
    
    static void delete(int id){
        tree.root = tree.deleteNode(tree.root, id);
    }
    
    static Node search(int id){
        return tree.search(id);
    }
    
    static void saveData(){
        FileOptions.deleteFile();
        tree.saveData(tree.root);
        JOptionPane.showMessageDialog(null, "Data Saved in File");
    }
}
