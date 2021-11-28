/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
import java.util.HashMap;
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int counter1=0;
        int counter2=0;
        int counter3=0;
        int a,b,c,d,e,f,g,h,k,l,p,q,r,s,t,u,v,w,x1,x2,y;
        int[] cardNum={160,161,162,163,174,175,176};
        int[] lostcard=new int[7];
        lostcard[6]=1767;
        String[] userName={"Romain","Rose","Mary","Bob","Azarnoush","Tirdad","Loui"};
        HashMap<Integer,Integer> pass=new HashMap<>();
        pass.put(160,234);
        pass.put(161,567);
        pass.put(162,978);
        pass.put(163,109);
        pass.put(174,211);
        pass.put(175,719);
        pass.put(176,325);
        double[] balance={1927,14596.45,24.375,633,792.5,12.2,211.28};
        y=(int)Math.random()*10+1;
        if(y==3){
            System.out.println(" دستگاه در حال حاضر آماده اراءه خدمات به شما عزیزان نمی باشد");
        }else{
        System.out.println(" Welcom to Arman Savings Bank ");
        System.out.println(" به صندوق پس اندازآرمان خوش آمدید ");
        System.out.println(" شعب شهاب آرمان در بیست و چهار ساعت شبانه روز آماده اراءه خدمات به مشتریان عزیز هستند ");
        boolean done11=false;
        loop11:
        while(done11==false){
        System.out.println();
        System.out.println(" Please Enter the code carved on your card ");
        System.out.println(" لطفا کد حک شده روی کارت خود را وارد نمایید");
        System.out.println(" مشتری گرامی در صورت مفقودی یا به همراه نداشتن کارت با وارد کردن شماره شش از سرویس های بدون کارت استفاده نمایید ");
       a = input.nextInt();
       if(a==6){
           done11=true;
           boolean done1=false;
           loop3:
           while(done1==false){
           System.out.println(" عملیات مورد نظر را انتخاب کنید");
           System.out.println("1)اعلام مفقودی کارت "+"            "+"2) برداشت وجه");
           System.out.println("3)خروج");
           b = input.nextInt();
           switch(b){
               case 1:
                   System.out.println(" لطفا کد حک شده روی کارت خود را وارد نمایید");
                   c = input.nextInt();
                   System.out.println("رمز را وارد کنید ");
                   d = input.nextInt();
                   if(pass.get(c)==d&&cardNum[c%10]==c){
                       System.out.println(" حساب شما تا اطلاع ثانوی مسدود گردید");
                       System.out.println(" کد چهار رقمی جهت برداشت وجه بدون کارت "+":");
                       System.out.println(cardNum[c%10]+"7");
                       lostcard[c%10]=c*10+7;
                       System.out.println(" از اطلاع رسانی شما متشکریم");
                       int n;
                       System.out.println("1)بازگشت"+"            "+"2)خروج");
                       n = input.nextInt();
                       if(n==1){
                           continue loop3;
                       }else{
                           System.out.println("عملیات قطع گردید");
                           System.out.println();
                           System.out.println("روز خوشی را برای شما آرزومندیم ");
                           done1=true;
                       }
                   }else{
                       System.out.println("چنین شماره حسابی موجود نمی باشد و یا رمز وارد شده اشتباه می باشد ");
                       loop1:
                       for(int i=0;i<2;i++){
                           if(i==0){
                           System.out.println("دوباره امتحان کنید");
                           }else{
                               System.out.println("این آخرین شانس شماست");
                           }
                           System.out.println(" لطفا کد حک شده روی کارت خود را وارد نمایید");
                           g = input.nextInt();
                           System.out.println("رمز را وارد کنید ");
                           h = input.nextInt();
                           if(pass.get(g)==h&&cardNum[g%10]==g){
                               System.out.println(" حساب شما تا اطلاع ثانوی مسدود گردید");
                               System.out.println(" کد چهار رقمی جهت برداشت وجه بدون کارت "+":");
                               System.out.println(cardNum[g%10]+"7");
                               lostcard[g%10]=g*10+7;
                               System.out.println(" از اطلاع رسانی شما متشکریم");
                               int o;
                               System.out.println("1)بازگشت"+"            "+"2)خروج");
                               o = input.nextInt();
                               if(o==1){
                                   continue loop3;
                               }else{
                           System.out.println("عملیات قطع گردید");
                           System.out.println();
                           System.out.println("روز خوشی را برای شما آرزومندیم ");
                           done1=true;
                               }
                           }else{
                               System.out.println("چنین شماره حسابی موجود نمی باشد و یا رمز وارد شده اشتباه می باشد");
                               if(i==1){
                                   done1=true;
                               }
                           }
                       }
                   }
                   break;
               case 2:
                   loop4:
                   for(int i=0;i<3;i++){
                   System.out.println("لطفا کد چهار رقمی را وارد کنید ");
                   e = input.nextInt();
                   boolean done2=false;
                   loop2:
                   while(done2==false){
                       if(lostcard[(e/10)%10]==e){
                       System.out.println("مبلغ مورد نظر خود را انتخاب کنید ");
                       System.out.println("1)1000"+"            "+"2)2000");
                       System.out.println("3)3000"+"            "+"4)مبالغ دیگر");
                       f = input.nextInt();
                       switch(f){
                           case 1:
                          if(balance[(e/10)%10]>=1000){
                              balance[(e/10)%10]-=1000;
                              done2=true;
                              done1=true;
                              System.out.println("لطفا وجه خود را بردارید");
                              System.out.println("از اعتماد شما سپاسگزاریم");
                          }else{
                              System.out.println("موجودی شما کافی نیست");
                              int m;
                              System.out.println("1)بازگشت"+"            "+"2)خروج");
                              m = input.nextInt();
                              if(m==1){
                              continue loop2;
                          }else{
                                  System.out.println("عملیات قطع گردید");
                                  System.out.println();
                                  System.out.println("روز خوشی را برای شما آرزومندیم ");
                                  done2=true;
                                  done1=true;
                              }
                          }
                          break;
                           case 2:
                               if(balance[(e/10)%10]>=2000){
                                   balance[(e/10)%10]-=2000;
                                   done2=true;
                                   done1=true;
                                   System.out.println("لطفا وجه خود را بردارید");
                                   System.out.println("از اعتماد شما سپاسگزاریم");
                               }else{
                                   System.out.println("موجودی شما کافی نیست");
                                   int m;
                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                   m = input.nextInt();
                                   if(m==1){
                                   continue loop2;
                               }else{
                                       System.out.println("عملیات قطع گردید");
                                       System.out.println();
                                       System.out.println("روز خوشی را برای شما آرزومندیم ");
                                       done2=true;
                                       done1=true;
                                   }
                               }
                               break;
                           case 3:
                               if(balance[(e/10)%10]>=3000){
                                   balance[(e/10)%10]-=3000;
                                   done2=true;
                                   done1=true;
                                   System.out.println("لطفا وجه خود را بردارید");
                                   System.out.println("از اعتماد شما سپاسگزاریم");
                               }else{
                                   System.out.println("موجودی شما کافی نیست");
                                   int m;
                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                   m = input.nextInt();
                                   if(m==1){
                                   continue loop2;
                               }else{
                                       System.out.println("عملیات قطع گردید");
                                       System.out.println();
                                       System.out.println("روز خوشی را برای شما آرزومندیم ");
                                       done2=true;
                                       done1=true;
                                   }
                               }
                               break;
                           case 4:
                               System.out.println("لطفا مبلغ مورد نظر خود را وارد کنید ");
                               l = input.nextInt();
                               if(balance[(e/10)%10]>=l){
                                   balance[(e/10)%10]-=l;
                                   done2=true;
                                   done1=true;
                                   System.out.println("لطفا وجه خود را بردارید");
                                   System.out.println("از اعتماد شما سپاسگزاریم");
                               }else{
                                   System.out.println("موجودی شما کافی نیست");
                                   int m;
                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                   m = input.nextInt();
                                   if(m==1){
                                   continue loop2;
                               }else{
                                       System.out.println("عملیات قطع گردید");
                                       System.out.println();
                                       System.out.println("روز خوشی را برای شما آرزومندیم ");
                                       done2=true;
                                       done1=true;
                                   }
                               }
                               break;
                               
                       }
                       break loop4;
                   }else{
                         System.out.println("کد چهار رقمی اشتباه وارد شده است ");
                         if(i!=2){
                         System.out.println("دوباره امتحان کنید");
                         }
                         if(i==2){
                             System.out.println("این آخرین شانس شما بود ");
                             done1=true;
                             done2=true;
                         }else{
                         continue loop4;
                       }
           }
       }
    }
               default:
                   System.out.println("عملیات قطع گردید");
                   System.out.println();
                   System.out.println("روز خوشی را برای شما آرزومندیم");
                   done1=true;
                   break;
                   }
}
}else{
           if(lostcard[a%10]==a*10+7){
               System.out.println("کارت شما تا اطلاع ثانوی ضبط گردید ");
           }else{
               if(cardNum[a%10]==a){
                   done11=true;
                   System.out.println(" Please choose your language ");
                   System.out.println(" لطفا زبان مورد نظر را انتخاب نمایید ");
                   System.out.println("1)English"+"            "+"2)فارسی");
                   p = input.nextInt();
                   switch(p){
                       case 1:
                           boolean done8=false;
                           loop8:
                           while(done8==false){
                           System.out.println(" Please enter your pin ");
                           q = input.nextInt();
                           if(pass.get(a)==q){
                               done8=true;
                               boolean done4=false;
                               loop4:
                               while(done4==false){
                               System.out.println(" Select the service ");
                               System.out.println("1)Cash Withdrawal"+"            "+"2)Balance Inquiry");
                               System.out.println("3)Transfer"+"                   "+"4)Bill Payments");
                               System.out.println("5)Card Charge"+"                "+"6)Pin Services");
                               System.out.println("7)Cash Card Flow"+"            "+"8)exit");
                               r = input.nextInt();
                               switch(r){
                                   case 1:
                                       boolean done5=false;
                                       loop5:
                                       while(done5==false){
                                       System.out.println(" Choose the amount of money you'd like to withdrawa ");
                                       System.out.println("1)1000"+"            "+"2)2000");
                                       System.out.println("3)3000"+"            "+"4)Others");
                                       s = input.nextInt();
                                       switch(s){
                                           case 1:
                                               if(balance[a%10]>=1000){
                                                   balance[a%10]-=1000;
                                                   done5=true;
                                                   System.out.println(" Please pick up your cash ");
                                                   System.out.println();
                                                   int z1=(int)Math.random()*1000+1;
                                                   System.out.println(" Trace number :"+z1);
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" You'r balance is n't enough ");
                                                   System.out.println();
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 2:
                                             if(balance[a%10]>=2000){
                                                   balance[a%10]-=2000;
                                                   done5=true;
                                                   System.out.println(" Please pick up your cash ");
                                                   System.out.println();
                                                   int z2=(int)Math.random()*1000+1;
                                                   System.out.println(" Trace number :"+z2);
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" You'r balance is n't enough ");
                                                   System.out.println();
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 3:
                                               if(balance[a%10]>=3000){
                                                   balance[a%10]-=3000;
                                                   done5=true;
                                                   System.out.println(" Please pick up your cash ");
                                                   System.out.println();
                                                   int z3=(int)Math.random()*1000+1;
                                                   System.out.println(" Trace number :"+z3);
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" You'r balance is n't enough ");
                                                   System.out.println();
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 4:
                                               System.out.println(" Please enter the amount of money you woud like to withdrawa ");
                                               t = input.nextInt();
                                               if(balance[a%10]>=t){
                                                   balance[a%10]-=t;
                                                   done5=true;
                                                   System.out.println(" Please pick up your cash ");
                                                   System.out.println();
                                                   int z4=(int)Math.random()*1000+1;
                                                   System.out.println(" Trace number :"+z4);
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" You'r balance is n't enough ");
                                                   System.out.println();
                                                   System.out.println("1)return"+"            "+"2)exit");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" Thanks for your trust ");
                                                       System.out.println();
                                                       System.out.println(" Wish you a best day!");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                       }
                               }
                                   case 2:
                                       System.out.println(" You'r balance is :"+balance[a%10]);
                                       System.out.println();
                                       int z5=(int)Math.random()*1000+1;
                                       System.out.println(" Trace number :"+z5);
                                       System.out.println("1)return"+"            "+"2)exit");
                                       t = input.nextInt();
                                       if(t==1){
                                           continue loop4;
                                       }else{
                                           System.out.println(" Thanks for your trust ");
                                           System.out.println();
                                           System.out.println(" Wish you a best day!");
                                           done4=true;
                                           done5=true;
                                       }
                                       break;
                                   case 3:
                                       System.out.println(" First check your balance & then make sure it's sufficient for the amount you'd like to transfer  ");
                                       System.out.println(" Pay attention that you can only transfer money to the account which belongs to this bank ");
                                       System.out.println();
                                       System.out.println(" Please enter the destination card number ");
                                       t = input.nextInt();
                                       if(cardNum[t%10]==t){
                                           System.out.println(" Enter the amount of money you'd like to transfer ");
                                           u = input.nextInt();
                                           System.out.println(" would you like to transfer money to "+userName[t%10]+"'s acount ?");
                                           System.out.println("1)yes"+"            "+"2)no");
                                           w = input.nextInt();
                                           if(w==1){
                                           balance[a%10]-=u;
                                           balance[t%10]+=u;
                                           System.out.println(" The transfer is done! ");
                                           System.out.println();
                                           int z6=(int)Math.random()*1000+1;
                                           System.out.println(" Trace number :"+z6);
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                       }else{
                                           System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                       }
                           }else{
                                           System.out.println(" Invalid card number ");
                                           System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                       }
                                       break;
                                   case 4:
                                       System.out.println(" This service is not available for now ");
                                       System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                           break;
                                   case 5:
                                       System.out.println(" This service is not available for now ");
                                       System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                           break;
                                   case 6:
                                       System.out.println(" Sorry but services for the second pin is not available now and you can only change your password ");
                                       pass.remove(a);
                                       boolean done6=false;
                                       loop6:
                                       while(done6==false){
                                       System.out.println(" Please enter the new password ");
                                       x1 = input.nextInt();
                                       System.out.println(" Please confirm ");
                                       x2 = input.nextInt();
                                       if(x1==x2){
                                           System.out.println(" Done!");
                                           pass.put(a,x1);
                                           System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                               done6=true;
                                           }
                                       }else{
                                           System.out.println(" They don't match ");
                                           System.out.println(" Try again ");
                                           System.out.println();
                                           continue loop6;
                                       }                                      
                                       }
                                       break;
                                   case 7:
                                       System.out.println(" This service is not available for now ");
                                       System.out.println();
                                           System.out.println("1)return"+"            "+"2)exit");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" Thanks for your trust ");
                                               System.out.println();
                                               System.out.println(" Wish you a best day ");
                                               done4=true;
                                           }
                                           break;
                                   default:
                                       System.out.println(" Thanks for your trust ");
                                       System.out.println();
                                       System.out.println(" Wish you a best day ");
                                       done4=true;
                   }
               }
           }else{
                               System.out.println(" Invalid pin ");
                               counter1++;
                               if(counter1>2){
                                   done8=true;
                               }
                               continue loop8;
                               }
                           }
                           break;
                       case 2:
                           boolean done9=false;
                           loop9:
                           while(done9==false){
                           System.out.println(" لطفا رمز خود را وارد نمایید ");
                           q = input.nextInt();
                           if(pass.get(a)==q){
                               done9=true;
                               boolean done4=false;
                               loop4:
                               while(done4==false){
                               System.out.println("نوع خدمات شتاب ");
                               System.out.println("1)برداشت وجه"+"            "+"2)اعلام مانده حساب");
                               System.out.println("3)انتقال وجه "+"            "+"4)پرداخت قبوض");
                               System.out.println("5)فروش شارژ"+"            "+"6)خدمات رمز");
                               System.out.println("7)گردش حساب"+"            "+"8)خروج");
                               r = input.nextInt();
                               switch(r){
                                   case 1:
                                       boolean done5=false;
                                       loop5:
                                       while(done5==false){
                                       System.out.println(" مبلغ مورد نظر خود را وارد نمایید ");
                                       System.out.println("1)1000"+"            "+"2)2000");
                                       System.out.println("3)3000"+"            "+"4)مبالغ دیگر");
                                       s = input.nextInt();
                                       switch(s){
                                           case 1:
                                               if(balance[a%10]>=1000){
                                                   balance[a%10]-=1000;
                                                   done5=true;
                                                   System.out.println("لطفا وجه خود را بردارید ");
                                                   System.out.println();
                                                   int z7=(int)Math.random()*1000+1;
                                                   System.out.println(" شماره پیگیری :"+z7);
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید ");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" موجودی شما کافی نیست ");
                                                   System.out.println();
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println("عملیات قطع گردید ");
                                                       System.out.println();
                                                       System.out.println("روز خوشی را برای شما آرزومندیم ");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 2:
                                             if(balance[a%10]>=2000){
                                                   balance[a%10]-=2000;
                                                   done5=true;
                                                   System.out.println(" لطفا وجه خود را بردارید ");
                                                   System.out.println();
                                                   int z8=(int)Math.random()*1000+1;
                                                   System.out.println(" شماره پیگیری :"+z8);
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println("عملیات قطع گردید ");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شماآرزومندیم");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" موجودی شما کافی نیست");
                                                   System.out.println();
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 3:
                                               if(balance[a%10]>=3000){
                                                   balance[a%10]-=3000;
                                                   done5=true;
                                                   System.out.println(" لطفا وجه خود را بردارید ");
                                                   System.out.println();
                                                   int z9=(int)Math.random()*1000;
                                                   System.out.println("شماره پیگیری:"+z9);
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" موجودی شما کافی نیست");
                                                   System.out.println();
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                           case 4:
                                               System.out.println("لطفا مبلغ مورد نظر خود را وارد نمایید ");
                                               t = input.nextInt();
                                               if(balance[a%10]>=t){
                                                   balance[a%10]-=t;
                                                   done5=true;
                                                   System.out.println(" لطفاوجه خود را بردارید ");
                                                   System.out.println();
                                                   int z10=(int)Math.random()*1000+1;
                                                   System.out.println("شماره پیگیری :"+z10);
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   t = input.nextInt();
                                                   if(t==1){
                                                       continue loop4;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید ");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                   }
                                               }else{
                                                   System.out.println(" موجودی شما کافی نیست");
                                                   System.out.println();
                                                   System.out.println("1)بازگشت"+"            "+"2)خروج");
                                                   u = input.nextInt();
                                                   if(u==1){
                                                       continue loop5;
                                                   }else{
                                                       System.out.println(" عملیات قطع گردید");
                                                       System.out.println();
                                                       System.out.println(" روز خوشی را برای شما آرزومندیم");
                                                       done4=true;
                                                       done5=true;
                                                   }
                                               }
                                               break;
                                       }
                               }
                                   case 2:
                                       System.out.println(" مانده حساب :"+balance[a%10]);
                                       System.out.println();
                                       int z11=(int)Math.random()*1000+1;
                                       System.out.println("شماره پیگیری :"+z11);
                                       System.out.println("1)بازگشت"+"            "+"2)خروج");
                                       t = input.nextInt();
                                       if(t==1){
                                           continue loop4;
                                       }else{
                                           System.out.println("عملیات قطع گردید ");
                                           System.out.println();
                                           System.out.println(" روز خوشی را برای شما آرزومندیم");
                                           done4=true;
                                           done5=true;
                                       }
                                       break;
                                   case 3:
                                       System.out.println(" ابتدا از مانده حساب خود جهت انتقال وجه اطمینان یابید ");
                                       System.out.println(" توجه کنید که تنها می توانید انتقال درون بانکی انجام دهید");
                                       System.out.println();
                                       System.out.println(" لطفا شماره کارت مقصد را وارد نمایید ");
                                       t = input.nextInt();
                                       if(cardNum[t%10]==t){
                                           System.out.println(" مبلغ مورد نظر را وارد نمایید ");
                                           u = input.nextInt();
                                           System.out.println(" آیا مایل به انتقال وجه به حساب "+userName[t%10]+"هستید؟ ");
                                           System.out.println("1)بله"+"            "+"2)خیر");
                                           w = input.nextInt();
                                           if(w==1){
                                           balance[a%10]-=u;
                                           balance[t%10]+=u;
                                           System.out.println(" عملیات انجام شد");
                                           int z12=(int)Math.random()*1000+1;
                                           System.out.println("شماره پیگیری :"+z12);
                                           System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید");
                                               System.out.println();
                                               System.out.println(" روز خوشی را برای شما آرزومندیم ");
                                               done4=true;
                                           }
                                       }else{
                                           System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید ");
                                               System.out.println();
                                               System.out.println(" روز خوشی را برای شما آرزومندیم");
                                               done4=true;
                                           }
                                       }
                           }else{
                                           System.out.println(" شماره کارت نامعتبر ");
                                           System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید ");
                                               System.out.println();
                                               System.out.println(" روز خوشی را برای شما آرزومندیم ");
                                               done4=true;
                                           }
                                       }
                                       break;
                                   case 4:
                                       System.out.println(" این سرویس در حال حاضر قابل اجرا نمی باشد ");
                                       System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید ");
                                               System.out.println();
                                               System.out.println(" روز خوشی را برای شما آرزومندیم");
                                               done4=true;
                                           }
                                           break;
                                   case 5:
                                       System.out.println(" این سرویس در حال حاضر قابل اجرا نمی باشد");
                                       System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید");
                                               System.out.println();
                                               System.out.println(" روز خوشی را برای شما آرزومندیم");
                                               done4=true;
                                           }
                                           break;
                                   case 6:
                                       System.out.println("متاسفانه در حال حاضر خدمات برای رمز دوم فعال نمی باشد و شما تنها قادرید رمز خود را تغییر دهید");
                                       pass.remove(a);
                                       boolean done6=false;
                                       loop6:
                                       while(done6==false){
                                       System.out.println(" لطفا رمز جدید را وارد نمایید ");
                                       x1 = input.nextInt();
                                       System.out.println(" رمز را مجددا وارد نمایید");
                                       x2 = input.nextInt();
                                       if(x1==x2){
                                           System.out.println(" رمز تغییر یافت");
                                           pass.put(a,x1);
                                           System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید");
                                               System.out.println(" روز خوشی را برای شما آرزومندیم");
                                               done4=true;
                                               done6=true;
                                           }
                                       }else{
                                           System.out.println("عدم تطابق رمزها");
                                           System.out.println("دوباره امتحان کنید");
                                           System.out.println();
                                           continue loop6;
                                       }                                      
                                       }
                                       break;
                                   case 7:
                                       System.out.println(" این سرویس در حال حاضر قابل اجرا نمی باشد");
                                       System.out.println();
                                           System.out.println("1)بازگشت"+"            "+"2)خروج");
                                           v = input.nextInt();
                                           if(v==1){
                                               continue loop4;
                                           }else{
                                               System.out.println(" عملیات قطع گردید ");
                                               System.out.println(" روز خوشی را برای شما آرزومندیم");
                                               done4=true;
                                           }
                                           break;
                                   default:
                                       System.out.println("عملیات قطع گردید");
                                       System.out.println();
                                       System.out.println("روز خوشی را برای شما آرزومندیم");
                                       done4=true;
                                       break;
           }                 
       }
}else{
                               System.out.println("رمز اشتباه است ");
                               counter2++;
                               if(counter2>2){
                                   done9=true;
                               }
                               continue loop9;
                           }
}
                       
           }
       }else{
              System.out.println(" Invalid code ");
              System.out.println("کد نامعتبر");
              counter3++;
              if(counter3>2){
                  done11=true;
              }
              continue loop11;
               }    
    }
}
}
}
    }
    
}
