package tw.matt0312;

import java.io.Serializable;

/*                        //基本型別不用序列化
 * 序列化 59號   Serializable說自己有序列化 所以擁有的屬性要序列化  主要差別在"屬性"private的這些 字串在api已經序列化了
 */
public class Student implements Serializable {  //宣告成這邊可以序列化
  private int ch; 
  private transient int math; //帶有transient是不要序列化
  private int eng;
  private String name;
  public Student(String name,int ch,int math,int eng){
	  this.name=name;this.ch=ch;this.math=math;this.eng=eng;
  }
  String getname(){
	  return name;
  }
  double sum(){ return ch+math+eng;};
  double avg(){return sum()/3;}
}
class car implements Serializable { //差別在資料會不會外洩
	
}