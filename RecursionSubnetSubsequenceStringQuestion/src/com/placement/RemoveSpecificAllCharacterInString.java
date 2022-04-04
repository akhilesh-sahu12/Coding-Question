package com.placement;
// str1=baccad   remove- 'a'
//        ans=bccd
// pass the ans string in argument ->can be passed to future calls
// Create the ans variable in function body ->new
//     baccad
//        |
//     b/accad
//        |
//     b/ccad
//         |
//     bc/cad
//        |
//     bcc/ad
//        |
//     bcc/d
//        |
//     bccd/
//       OR
//     (baccad)
//     [ch=b+ ]
//           |
//         (accad)
//         [ch=" "+ ]
//                 |
//               (ccad)
//               [ch=c+ ]
//                     |
//                   (cad)
//                   [ch=b+ ]
//                         |
//                        (ad)
//                        [ch=""+ ]
//                               |
//                              (d)
//                             [ch=d+ ]
//                                   |
//
public class RemoveSpecificAllCharacterInString {
    public static void main(String[] args) {
      //  skip("", "baccad");
      //  String ans= skip("baccad");
      //  System.out.println(ans);
       /* String ans= skipApple("bacapplecad");
          System.out.println(ans);*/
        String ans= skipAppNotApple("bacapplcad");
        System.out.println(ans);

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));

        } else {
            skip(p+ch, up.substring(1));

        }
    }
    static String skip(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return  skip( up.substring(1));

        } else {
           return ch+skip(up.substring(1));

        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){

            return "";
        }

        if(up.startsWith("apple")){
            return  skipApple(up.substring(5));

        } else {
            return up.charAt(0)+skipApple(up.substring(1));

        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){

            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return  skipAppNotApple(up.substring(3));

        } else {
            return up.charAt(0)+skipAppNotApple(up.substring(1));

        }
    }
}
