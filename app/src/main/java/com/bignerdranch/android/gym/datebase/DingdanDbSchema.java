package com.bignerdranch.android.gym.datebase;

public class DingdanDbSchema {
    public static final class DingdanTable {
        public static final String NAME = "dingdans";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
