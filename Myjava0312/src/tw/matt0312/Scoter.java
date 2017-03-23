package tw.matt0312;
/*
 *  跑的程式在23號
 */
public class Scoter extends Bike {     //在這邊直接打extends
			Scoter(){       //開始定義自己的建構式  建構式沒有在繼承的
				//super();   這邊也可以寫成super(3)跑到父類別的int那邊
				//第一道敘述句逃不過this跟super 沒有說哪一行先執行這邊做了第三行第四行後才執行第6行				
				             //源頭道object   //只有建構式不能繼承 屬性方法都可以繼承
				System.out.println("Scoter()");
			}
			void upSpeed(){			//這邊是改寫	//""這邊開始從新定義加速度""用自己的 減速度沒改變一樣用父類別的
			  super.upSpeed();   //程式設計先用爸爸的招數再增加,會先用原方法再加入自己的方法
			  speed = (speed<1)?1.5:(speed*3.2);  		//  因為屬性完全封裝所以只能在bike用				
				//這邊碼調加下面總共有三招 bike 2招加這招共三招功能更新我們從新命名 可以保留父類別的東西強化功能
			    //如果沒有碼調換變成只有兩招
			}
//			void upSpeedv2(){      // //bike 2招加這招共三招功能更新我們從新命名 可以保留父類別的東西強化功能
//				
//			}
}
