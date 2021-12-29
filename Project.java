import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Project {
    private String name = null;
    private String subject = null;
    private int duration = -1;

    public Project() {
    }

    public void readProject() {
        boolean ok =true ;
        Scanner scanner = new Scanner(System.in);
        do{
            ok = true;
            try {
                
                System.out.println("Donnez le nom du projet : ");
            name = scanner.nextLine();
            if (name.length() > 50){
                throw new NameTooLongException();
                ok = false;
            }
                

            System.out.println("Donnez le sujet du projet : ");
            subject = scanner.nextLine();
            if (subject.length() > 50){
                ok = false;
                throw new NameTooLongException();
            }
                

            System.out.println("Donnez la durée du projet : ");
            duration = scanner.nextInt();

            if (duration < 1) {
                ok = false;
                throw new WrongDurationException();
            }

    } catch (NameTooLongException e) {
        System.err.println(e.getMessage());
    } catch (InputMismatchException e) {
        System.err.println("La duree saisie n'est pas valide");
    } catch (WrongDurationException e) {
        System.err.println(e.getMessage());
    }

}

        }while(ok == false);




        
}

class SafeProject {
    private final static int NB_PROJECTS = 3;

    public static void main(String[] args) {
        ArrayList<Project> projects = new ArrayList<Project>();
        do {
            Project project = new Project();
            project.readProject();
            projects.add(project);
        } while (projects.size() < NB_PROJECTS);
    }
}

class WrongDurationException extends Exception {
    public WrongDurationException() {
        super("Erreur de duree");
    }

    public WrongDurationException(String message) {
        super(message);
    }
}

class NameTooLongException extends Exception {
    public NameTooLongException() {
        super("Erreur de langueur de l'entree");
    }

    public NameTooLongException(String message) {
        super(message);
    }
}