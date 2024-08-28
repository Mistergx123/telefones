import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner lol = new Scanner(System.in);
        String username = "lol";
        String password = "123";
        
        System.out.print("Digite o seu nome: \n");
        String inputUsername = lol.nextLine();
        System.out.print("Digite a sua senha:\n");
        String inputPassword = lol.nextLine();
        
        if(inputUsername.equals(username)&& inputPassword.equals(password)){
            System.out.print("Login bem sucedido.\n");
          
        } else{
            System.out.print("Incorreto.\n");
            lol.close();
            return;
        }
            
            
            
            Scanner menu = new Scanner (System.in);
                System.out.print("|-------------------|\n");
                System.out.print("|-----Celulares-----|\n");
                System.out.print("|-------------------|\n");
                System.out.print("|Opção 1 - samsung  |\n");
                System.out.print("|Opção 2 - motorola |\n");
                System.out.print("|Opção 3 - Nokia    |\n");
                System.out.print("|Opção 4 - Iphone   |\n");
                System.out.print("|Opção 5 - sair     |\n");
                System.out.print("|-------------------|\n");
                System.out.print("|Digite uma opção:  |\n");
           int opção = menu.nextInt();
           
           switch (opção) {
               case 1:
                   System.out.print("\nVoce escolheu Samsung");
                   break;
                   
               case 2:
                   System.out.print("\nVoce escolheu Motorola");
                   break;
                   
               case 3:
                   System.out.print("\nVoce escolheu Nokia");
                   break;
                   
               case 4:
                   System.out.print("\nVoce escolheu Iphone");
                   break;
                   
               case 5:
                   System.out.print("\nVoce saiu!");
                  
                   menu.close();  
           }
           
            //}
            
        }
        
        //scanner.close();
        
    }
    
//}