package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Contact, Customer{

        private IncomeData data = null;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        }

        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        public String getPhoneNumber() {
            String numberCode = String.valueOf(this.data.getCountryPhoneCode());
            String numberPhone = String.valueOf(this.data.getPhoneNumber());
            StringBuilder n1 = new StringBuilder(numberPhone);
            if(n1.length() < 10) {
                for (int i = 0; i < 10 - numberPhone.length(); i ++) {
                    n1.insert(0,"0");
                }
            }
            String n = String.valueOf(n1);
            return "+" + numberCode + "(" + n.substring(0,3) + ")" + n.substring(3,6) + "-" + n.substring(6,8) + "-" + n.substring(8);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}