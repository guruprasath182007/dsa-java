import java.util.*;
interface stack
{
 void push(string item);
 String pop();
 String peek();
 boolean isEmpty();
}
class ArrayStack implements stack
{
 private String[]elements=new string[10];
 private int top=-1;
 public void push(string item)
{
  if(top==elements.length-1){
  System.out.println("stack is full!cannot push");
  return;
   }
    elements[++top]=item;
    }
   public String pop()
{
   if (isEmpty())
{
    System.out.println("stack underflow.cannot pop");
    return elements[top--];
        }
  public String peek()
{
   if (isEmpty())return null;
   return elements[top];
    }
  public boolean isEmpty(){
        return top==-1;
    }
    }
  public class TextEditorUndo{
  public static void main(string[]args){
  Scanner sc=new Scanner(System.in);
  Arraystack undostack=new Arraystack();
  while(true){
           System.out.println("\n----Text Editor----");
           System.out.println("1.typetext");
           System.out.println("2.undo");
           System.out.println("3.view current text");
           System.out.println("4.exit");
           System.out.println("enter choice:");
           int choice=sc.nextLine();
           switch(choice){
              case 1:
                   System.out.println("enter text:");
                   String text=sc.nextLine();
                   undostack.push(text);
                   break;
              case 2:
                  String undone=undostack.pop();
                  if(undone!=null){
                        System.out.println("Undo"+undone);
                      }
                   break;
              case 3:
                  String current=undostack.peek();
                  System.out.println("current text:"+(current!=null?current:"no text"));
                  break;
               case 4:
                  System.out.println("exiting....");
                  sc.close();
                  return;
            default:
                  System.out.println("invalid choice!try again");
                }
            }
        }
    }
    


