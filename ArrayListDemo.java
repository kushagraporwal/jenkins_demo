import java.util.*;
class ArrayListDemo
{
public static void main(String args[])
{
ArrayList al= new ArrayList();
System.out.println("Initial size of al: "+al.size());
al.add("c");
al.add("e");
al.add("b");
al.add("d");
al.add("f");
al.add("5");
al.add("Ayan");
al.add("20.25");
al.add(1,"a2");
System.out.println("size of al after additions: "+al.size());
System.out.println("contents of al: "+al);
al.remove("f");
al.remove(2);
System.out.println("size of al after deletions: "+al.size());
System.out.println("contents of al: "+al);
Iterator itr= al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
String s;
Iterator itr2= al.iterator();
while(itr2.hasNext())
{
s=itr2.next().toString();
System.out.println(s);
}
String s2;
for(int i=0;i<al.size();i++)
{
s2=al.get(i).toString();
System.out.println(s2);
}
}}