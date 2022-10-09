import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       例List<Object> array = new ArrayList<>();
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
        List<String> array = new ArrayList<String>();
        array.add("hoge");
        array.add("pos");
        array.add("foo");

//      問② arrayの二つ目の要素を"bar"にしましょう。
//	　<以下記述>
        array.add("hoge");
        array.add("bar");
        array.add("foo");

//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
        int arrayNo = array.indexOf("foo");
        System.out.println(arrayNo);
		}
		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
        map.put("address","////");
        map.put("name","kousuke");
        map.put("age",29);
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        for(String key:map.keySet()){
            System.out.println(key);
        }

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
        for(Object val:map.values()){
            System.out.println(val);
        }
		}
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に変更しましょう。
        List<Object> arrayDate = new ArrayList<Object>();
        arrayDate.add(cal.get(Calendar.YEAR));
        arrayDate.add(cal.get(Calendar.MONTH)+1);
        arrayDate.add(cal.get(Calendar.DATE));
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
            for(int I = 1; I<=3; I++){
                System.out.println(arrayDate.get(I-1));
            }
		}
	}

}