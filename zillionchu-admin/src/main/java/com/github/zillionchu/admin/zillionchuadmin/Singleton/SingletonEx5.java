package com.github.zillionchu.admin.zillionchuadmin.Singleton;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:27
 * @Description:
 */
public class SingletonEx5 {




    private SingletonEx5(){

    }

    public static SingletonEx5 getInstance(){
        return Singleton.SINGLETON.getSingletonEx5();
    }



  private enum Singleton{
      SINGLETON;

      private SingletonEx5 singletonEx5;



      Singleton(){
          singletonEx5=new SingletonEx5();
      }

          public SingletonEx5 getSingletonEx5(){
          return  singletonEx5;
      }
  }

    public static void main(String[] args) {
        System.out.println(SingletonEx5.getInstance().hashCode());
        System.out.println(SingletonEx5.getInstance().hashCode());
        System.out.println(SingletonEx5.getInstance().hashCode());
        System.out.println(SingletonEx5.getInstance().hashCode());
    }

}
