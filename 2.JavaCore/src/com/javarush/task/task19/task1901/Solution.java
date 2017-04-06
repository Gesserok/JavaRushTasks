package com.javarush.task.task19.task1901;

/* 
TableAdapter
*/

public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        ATable aTable1 = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "name";
            }

            @Override
            public String getTableName() {
                return "tablename";
            }
        };



        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());

        BTable table1 = new TableAdapter(aTable1);
        System.out.println(table1.getHeaderText());

    }

    public static class TableAdapter implements BTable{
        private ATable aTable = null;


        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        public String getHeaderText() {
            return "[" + aTable.getCurrentUserName() + "] : " + aTable.getTableName();
        }

    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}