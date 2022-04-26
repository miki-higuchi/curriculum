import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//          List<Object> array = new ArrayList<>();
//	    <以下記述>
			 List<String> array = new ArrayList<>();
			
//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
			 array.add("foo");
			 array.add("bar");
			 
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
			 System.out.println("fooのインデックス：" + array.size());
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address","0624");
		map.put("name","miki");
		map.put("age","25");
		
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
		for (Map.Entry<String,Object> hm : map.entrySet()){
			System.out.println("key : " + hm.getKey());
		}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
		for (Map.Entry<String,Object> hm : map.entrySet()){
			System.out.println("Value : " + hm.getValue());

		}
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           System.out.println(cal.getTime());
//	    <以下記述>
           String[] arrayDate = new String[] {"2022","04","26"};
           
//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
           List<String> arrayList = new ArrayList<>();
            
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
           for (int i=0; i<arrayDate.length; i++) {
        	   arrayList.add(arrayDate[i]);
           }
           System.out.println(arrayList);
		}
	}

	}
}


  
