package com.example.davd.multiroot;

/**
 * Created by davd on 02/10/2016.
 */

public class Root {


        // fields
        private double num;  //name of the person
        private int order,count; // maximum number of books the person can borrow

        // constructor
        public Root(){
            num=1;
            order=1;
        }

        public void setOrder(int ord){
            order = ord;
        }

        public void setNum(double number){
            num = number;
        }

        public double getNum(){
            return num;
        }

        public int getOrder(){
            return order;
        }

        public int getCount(){
            return count;
        }


        public double eval(){
            double est_prov, est, delta, ord_f;
            ord_f=(float)order;           //order floated

            count=1;
            est_prov=1;
            est = num / (Math.pow(est_prov, (ord_f-1)));  //re-estimate
            delta=Math.abs(num - Math.pow(est, ord_f));   // calc diff between num and est to the power order
            while( (delta) > 0.001 ){                     // check the error
                // check the error
                est_prov = (est_prov + est)/2;
                est = num / (Math.pow(est_prov, (ord_f-1)));  //re-estimate

//        Debug line
//        System.out.println("The " + count + " est is " +est+ "and the error is " +delta);

                count++;                                     // increment the count
                delta=Math.abs(num - Math.pow(est, ord_f));  // calc diff between num and est to the power order
            }

            return est;
        }

}
