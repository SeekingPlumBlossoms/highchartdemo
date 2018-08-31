package com.example.highchartdemo.controller;

public class client {
    public static void main(String[] args){
        String sqllll="783387\t49231\t734156\t293186937\t0.017%\n" +
                "861003\t27877\t833126\t294020035\t0.010%\n" +
                "741216\t20568\t720648\t294740649\t0.007%\n" +
                "560220\t54626\t505594\t295246182\t0.019%\n" +
                "496171\t28349\t467822\t295713973\t0.010%\n" +
                "439833\t23158\t416675\t296130613\t0.008%\n" +
                "439681\t56025\t383656\t296514237\t0.019%\n" +
                "399307\t32668\t366639\t296880858\t0.011%\n" +
                "446633\t23878\t422755\t297303597\t0.008%\n" +
                "390851\t39513\t351338\t297654908\t0.013%\n" +
                "348967\t27439\t321528\t297976413\t0.009%\n" +
                "332215\t31429\t300786\t298277171\t0.011%\n" +
                "363782\t23380\t340402\t298617558\t0.008%\n" +
                "363951\t71262\t292689\t298910201\t0.024%\n" +
                "352819\t39239\t313580\t299223765\t0.013%\n" +
                "285179\t30577\t254602\t299478343\t0.010%\n" +
                "434914\t57078\t377836\t299856150\t0.019%\n" +
                "388598\t71732\t316866\t300172980\t0.024%\n" +
                "388861\t33320\t355541\t300528487\t0.011%\n" +
                "393922\t25868\t368054\t300896520\t0.009%\n";
      String sql1="INSERT INTO `analysis_user` (`new_number_people`, `unfollow_number_people`, `net_increase_number_people`, `cumulative_number_people`, `daily_fetching_rate`, `date_year`, `date_mon`, `date_day`) VALUES (";
      String[] np=sqllll.split("\n");
            for (int i = 0; i <np.length ; i++) {
                String[] value=np[i].split("\t");
                String s2=sql1+"'"+value[0]+"',";
                s2+="'"+value[1]+"',";
                s2+="'"+value[2]+"',";
                s2+="'"+value[3]+"',";
                s2+="'"+( Double.parseDouble(value[4].replace("%","")) * 10000)+"',";
                s2+="'2018','8','"+(i+1)+"');";
                System.out.println(s2);
            }

    }
}
