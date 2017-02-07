import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.awt.Font.*;
 class A
 {
	static Connection cn;
	static Statement st;
	static ResultSet rs;
	static JFrame F,F1,F2,F3,NEW,AB;
	static JButton B1,B2,B3,BH1,BH2,GH1,GH2,PW,NU,SBB;
	static JLabel l1,l2,l3,l10,L7,lp,nu,en,eid,ep,eg,lpu,ed;
    static JPasswordField p1;
    static JTextField t1,tn,tid,tp,tg;
	static ImageIcon i2,i3,ii;
	static JFrame FQ;
	static JButton CNF,BQ,LGT;
	public static void main(String[] arg)
	{
		try{
		//frame 1 
        
		F=new JFrame("Hostel Allotment");
		F.setLayout(new BorderLayout());
		F.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		Font font1 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 16);
		Font font11 = new Font("SansSerif", Font.BOLD, 30);
		Font font2 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 40);
		Font font3 = new Font("SansSerif", Font.ITALIC, 16);
		Font font4 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 20);
		Font font143 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 50);
		B1=new JButton("About Us");
		B2=new JButton("Login Portal");
		B1.setBounds(500,300,80,30);
		B2.setBounds(700,300,150,30);
		B1.setFont(font1);
		B2.setFont(font1);
		lpu=new JLabel("LOVELY PROFESSIONAL UNIVERSITY");
	    lpu.setBounds(200,150,1200,70);
		lpu.setFont(font143);
		ii=new ImageIcon("lpu9.jpg");
		l3= new JLabel(ii);
		F.add(B1);
		F.add(B2);
		F.add(lpu);
		F.add(l3);
		B2.addActionListener(new D());
		B1.addActionListener(new D());
		
		F.setSize(1300,700);
        F.setVisible(true);
		//frame AB
		AB=new JFrame("About this project.");
		AB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AB.setLayout(null);
		AB.setVisible(false);
		//Frame 2
		F1=new JFrame("Login Portal");
		F1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		F1.setLayout(new BorderLayout());
		i3=new ImageIcon("lpu10.jpg");
		l10= new JLabel(i3);
		p1=new JPasswordField();
		p1.setBounds(780,300,300,50);
		p1.setFont(font11);
		F1.setSize(1300,700);
        F1.setVisible(false);
		l1=new JLabel("User ID");
        l1.setBounds(135,310,200,30);
		lp=new JLabel("Password");
        lp.setBounds(605,310,200,30);
		lp.setFont(font11);
        t1=new JTextField();
        t1.setBounds(250,300,300,50);
        B3=new JButton("Login");
        B3.setBounds(600,400,100,30);
		NU=new JButton("New User???");
        NU.setBounds(800,500,150,30);
		l1.setFont(font11);
		t1.setFont(font11);
		B3.setFont(font1);
		NU.setFont(font1);
		B3.addActionListener(new E());
		NU.addActionListener(new FN());
		F1.add(NU);
		F1.add(p1);
		F1.add(lp);
		F1.add(l1);
		F1.add(t1);
		F1.add(B3);
		F1.add(l10);
		//New user ka code
		
		NEW=new JFrame("New user");
		ed=new JLabel("Enter your Admission Details");
		en=new JLabel("Name :");
		eid=new JLabel("User Id  :");
		eg=new JLabel("Gender Male/Female  :");
		ep=new JLabel("Password :");
		tn=new JTextField();
		tid=new JTextField();
		tg=new JTextField();
		tp=new JTextField();
		SBB=new JButton("SUBMIT");
		ed.setBounds(10,10,600,40);
		ed.setFont(font2);
		en.setBounds(100,100,80,20);
		eid.setBounds(100,130,80,20);
		eg.setBounds(100,160,150,20);
		ep.setBounds(100,190,80,20);
		tn.setBounds(200,100,80,20);
		tid.setBounds(200,130,80,20);
		tg.setBounds(250,160,80,20);
		tp.setBounds(200,190,80,20);
		SBB.setBounds(250,250,100,30);
		NEW.add(ed);
		NEW.add(en);
		NEW.add(eid);
		NEW.add(eg);
		NEW.add(ep);
		NEW.add(tn);
		NEW.add(tid);
		NEW.add(tg);
		NEW.add(tp);
		NEW.add(SBB);
		SBB.addActionListener(new sub());
		NEW.setLayout(null);
		NEW.setSize(800,500);
		NEW.setVisible(false);
		//Frame 3 hostel select For Boy's
		F2=new JFrame("BOY's HOSTELS");
		F2.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		F2.setLayout(new BorderLayout());
		JLabel l4=new JLabel("Select The Hostel Of Your Choice");
		l4.setFont(font2);
		l4.setBounds(400,100,640,60);
		i2=new ImageIcon("lpu2.jpg");
		L7= new JLabel(i2);
		BH1=new JButton("BH1");
		BH1.setFont(font1);
		BH2=new JButton("BH2");
		BH2.setFont(font1);
		BH1.setBounds(450,250,100,100);
		BH2.setBounds(600,250,100,100);
		F2.add(l4);
		F2.add(BH1);
		F2.add(BH2);
		F2.add(L7);
		F2.setSize(1300,700);
        F2.setVisible(false);
		//Frame 4 Hostel Select for girl's
        F3=new JFrame("HOSTEL'S OPTION FOR GIRL'S");
		F3.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		F3.setLayout(new BorderLayout());
		JLabel l8=new JLabel("Select The Hostel Of Your Choice");
		l8.setFont(font2);
		l8.setBounds(400,100,640,60);    
		GH1=new JButton("GH1");
		GH1.setFont(font1);
		GH2=new JButton("GH2");
		GH2.setFont(font1);
		GH1.setBounds(450,250,100,100);
		GH2.setBounds(600,250,100,100);
		F3.add(l8);
		F3.add(GH1);
		F3.add(GH2);
		F3.add(L7);
		BH1.addActionListener(new H());
		BH2.addActionListener(new H());
		GH1.addActionListener(new H());
		GH2.addActionListener(new H());
		F3.setSize(1300,700);
        F3.setVisible(false);
        //OTHER FACILIY
		
		FQ=new JFrame("Other Facilities");
				   JLabel LQ=new JLabel("Other Optional Facilities");
				   LQ.setBounds(400,100,500,40);
				   LQ.setFont(font2);
				   JCheckBox cb=new JCheckBox("Hostel Mess");
				   cb.setBounds(400,300,400,25);
				   cb.setFont(font4);
				   JCheckBox cb1= new JCheckBox("Laundry");
				   cb1.setBounds(400,350,400,25);
				   cb1.setFont(font4);
				   JCheckBox cb2= new JCheckBox("Avail Daily Newspaper");
				   cb2.setBounds(400,400,400,25);
				   cb2.setFont(font4);
				   JButton BQ=new JButton("SUBMIT");
				   BQ.setBounds(700,550,100,20);
				   FQ.add(BQ);
				   CNF=new JButton ("Confirm");
	 CNF.setBounds(900,550,100,20);
	 FQ.add(CNF);
	 CNF.setEnabled(false);
	 LGT=new JButton("LOGOUT");
	 LGT.setBounds(1100,50,100,20);
	 LGT.setEnabled(true);
	FQ.add(LGT);	
		FQ.setLayout(null);
				   FQ.add(cb2);
				   FQ.add(LQ);
				   FQ.add(cb);
				   FQ.add(cb1);
				   FQ.setSize(1300,700);
				   FQ.setVisible(false);
				   BQ.addActionListener(new L());
				   CNF.addActionListener(new L());
				   LGT.addActionListener(new L());
	
		
		//JDBC
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","96%%Rk");
		st = cn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
 }
 class sub implements ActionListener
 {
	 public void actionPerformed(ActionEvent aev)
	 {
 try
             {		
		String name=A.tn.getText();
		 String id=A.tid.getText();
		 int i = Integer.parseInt(id);
		 String gen=A.tg.getText();
		 String ps=A.tp.getText();
         String cmnd="insert into student(user_id,gender,name,password) values("+i+",'"+gen+"','"+name+"','"+ps+"')";
        
				 String ece="update student set status=0 where user_id="+i+"";
	             A.st.executeUpdate(cmnd);
	             A.st.executeUpdate(ece);
              }
             catch(Exception ec)
            {
	           System.out.println(ec);
            }
	 }
 }
 class D implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==A.B1)
		{
A.F.setVisible(false);
		A.AB.setVisible(true);
		}
		else{
			A.F.setVisible(false);

		A.F1.setVisible(true);
		}
			}
}
class FN implements ActionListener
{
	public void actionPerformed(ActionEvent ne)
	{
		A.NEW.setVisible(true);
	}
}
 class E implements ActionListener
{
	static int i;
	static String c;
	static String psc;
	public void actionPerformed(ActionEvent e)
	{
		String a = A.t1.getText();
		 i = Integer.parseInt(a);
		System.out.println(a);
		String b="select gender from student where User_id ="+i+"";
		try
		{
			
			A.rs=A.st.executeQuery(b);
			while(A.rs.next()){
			c=A.rs.getString("gender");
			System.out.println(c);
			}
			if(c.equals("male"))
			{
				A.F1.setVisible(false);
				A.F2.setVisible(true);
			}
			else
			{
				A.F1.setVisible(false);
				A.F3.setVisible(true);		
			}
			
			
			
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
		}
		}
 class H implements ActionListener
{
	 static JFrame F4;
    static  JButton a,B,C,aa,BB,CC,aaa,BBB,CCC,Ga,GB,GC,Gaa,GBB,GCC,aG,BG,CG;	 
	public void actionPerformed(ActionEvent h)
	{
		Font font5 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 40);
		Font font6 = new Font("SansSerif", Font.BOLD, 15);
		if(h.getSource()==A.BH1)
		{
			A.F2.setVisible(false);
			F4=new JFrame("BH1");
			F4.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			JLabel z=new JLabel("Select your Block");
			z.setBounds(450,150,500,50);
			z.setFont(font5);
			a=new JButton("A Block");
			a.setBounds(400,200,100,100);
			a.setFont(font6);
			B=new JButton("B Block");
			B.setBounds(550,200,100,100);
			B.setFont(font6);
			F4.add(z);
			F4.add(a);
			F4.add(B);
			F4.setLayout(new BorderLayout());
			F4.setVisible(true);
			F4.setSize(1300,700);
			a.addActionListener(new M());
			B.addActionListener(new M());
		}
		else
			if(h.getSource()==A.BH2)
		{
			A.F2.setVisible(false);
            JFrame F4=new JFrame("BH2");
			F4.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			JLabel z=new JLabel("Select your Block");
			z.setBounds(450,150,500,50);
			z.setFont(font5);
			aa=new JButton("A Block");
			aa.setBounds(400,200,100,100);
			aa.setFont(font6);
			BB=new JButton("B Block");
			BB.setBounds(550,200,100,100);
			BB.setFont(font6);
			F4.add(z);
			F4.add(aa);
			F4.add(BB);
			F4.setLayout(new BorderLayout());
			F4.setVisible(true);
			F4.setSize(1300,700);
			aa.addActionListener(new M());
			BB.addActionListener(new M());
		}
			else
				if(h.getSource()==A.GH1)
				{
			A.F3.setVisible(false);
			JFrame F4=new JFrame("GH1");
			F4.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			JLabel z=new JLabel("Select your Block");
			z.setBounds(450,150,500,50);
			z.setFont(font5);
			Ga=new JButton("A Block");
			Ga.setBounds(400,200,100,100);
			Ga.setFont(font6);
			GB=new JButton("B Block");
			GB.setBounds(550,200,100,100);
			GB.setFont(font6);
	        F4.add(z);
			F4.add(Ga);
			F4.add(GB);
			F4.setLayout(new BorderLayout());
			F4.setVisible(true);
			F4.setSize(1300,700);
				Ga.addActionListener(new M());
			GB.addActionListener(new M());
		}
			else
				if(h.getSource()==A.GH2)
				{
			A.F3.setVisible(false);
			JFrame F4=new JFrame("GH2");
			F4.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			JLabel z=new JLabel("Select your Block");
			z.setBounds(450,150,500,50);
			z.setFont(font5);
			Gaa=new JButton("A Block");
			Gaa.setBounds(400,200,100,100);
			Gaa.setFont(font6);
			GBB=new JButton("B Block");
			GBB.setBounds(550,200,100,100);
			GBB.setFont(font6);
	      	F4.add(z);
			F4.add(Gaa);
			F4.add(GBB);
			F4.setLayout(new BorderLayout());
			F4.setVisible(true);
			F4.setSize(1300,700);
			Gaa.addActionListener(new M());
			GBB.addActionListener(new M());
			}
				
	}

}
class M implements ActionListener
{
	static JFrame F5,F6,F8,F9;
	static JButton q,w,e,r,t,q1,w1,e1,r1,t1,q2,w2,e2,r2,t2;
	static JLabel  L1,L2,L4,L3,li;
	static ImageIcon i4;
	Font font5 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 40);
	public void actionPerformed(ActionEvent m)
	{
		if(m.getSource()== H.a)
		{
			H.F4.setVisible(false);
            JFrame F5=new JFrame("Rooms Available");
            L4=new JLabel("BH1 Block-A Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			
		
			q=new JButton("101-A");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-A");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-A");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-A");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-A");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-A");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-A");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-A");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-A");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-A");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-A");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-A");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-A");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-A");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-A");
		    t2.setBounds(730,470,70,70);
			i4=new ImageIcon("lpu12.jpg");
		    li= new JLabel(i4);
			F5.setLayout(null);
			
			F5.add(L4);
			F5.add(L1);
			F5.add(L2);
			F5.add(L3);
			F5.add(q);
			F5.add(w);
			F5.add(e);
			F5.add(r);
			F5.add(t);
			F5.add(q1);
			F5.add(w1);
			F5.add(e1);
			F5.add(r1);
			F5.add(t1);
			F5.add(q2);
			F5.add(w2);
			F5.add(e2);
			F5.add(r2);
			F5.add(t2);
			F5.add(li);
			F5.setSize(1300,700);
			F5.setVisible(true);
			q.addActionListener(new P());
			w.addActionListener(new P());
			e.addActionListener(new P());
			r.addActionListener(new P());
			t.addActionListener(new P());
			q1.addActionListener(new P());
			w1.addActionListener(new P());
			e1.addActionListener(new P());
			r1.addActionListener(new P());
			t1.addActionListener(new P());
			q2.addActionListener(new P());
			w2.addActionListener(new P());
			e2.addActionListener(new P());
			r2.addActionListener(new P());
			t2.addActionListener(new P());
		}
		else
			if(m.getSource()== H.B)
		{   
	        H.F4.setVisible(false);
		    F6=new JFrame("Rooms Available");
            L4=new JLabel("BH1 Block-B Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-B");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-B");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-B");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-B");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-B");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-B");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-B");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-B");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-B");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-B");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-B");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-B");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-B");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-B");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-B");
		    t2.setBounds(730,470,70,70);
			F6.setLayout(null);
			F6.add(L4);
			F6.add(L1);
			F6.add(L2);
			F6.add(L3);
			F6.add(q);
			F6.add(w);
			F6.add(e);
			F6.add(r);
			F6.add(t);
			F6.add(q1);
			F6.add(w1);
			F6.add(e1);
			F6.add(r1);
			F6.add(t1);
			F6.add(q2);
			F6.add(w2);
			F6.add(e2);
			F6.add(r2);
			F6.add(t2);
			F6.setSize(1300,700);
			F6.setVisible(true);
			q.addActionListener(new Q());
			w.addActionListener(new Q());
			e.addActionListener(new Q());
			r.addActionListener(new Q());
			t.addActionListener(new Q());
			q1.addActionListener(new Q());
			w1.addActionListener(new Q());
			e1.addActionListener(new Q());
			r1.addActionListener(new Q());
			t1.addActionListener(new Q());
			q2.addActionListener(new Q());
			w2.addActionListener(new Q());
			e2.addActionListener(new Q());
			r2.addActionListener(new Q());
			t2.addActionListener(new Q());
		}
		else
		if(m.getSource()== H.aa)
		{
			//H.F4.setVisible(false);
		    JFrame F8=new JFrame("Rooms Available");
            L4=new JLabel("BH2 Block-A Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-A");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-A");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-A");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-A");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-A");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-A");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-A");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-A");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-A");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-A");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-A");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-A");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-A");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-A");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-A");
		    t2.setBounds(730,470,70,70);
			F8.setLayout(null);
			F8.add(L4);
			F8.add(L1);
			F8.add(L2);
			F8.add(L3);
			F8.add(q);
			F8.add(w);
			F8.add(e);
			F8.add(r);
			F8.add(t);
			F8.add(q1);
			F8.add(w1);
			F8.add(e1);
			F8.add(r1);
			F8.add(t1);
			F8.add(q2);
			F8.add(w2);
			F8.add(e2);
			F8.add(r2);
			F8.add(t2);
			F8.setSize(1300,700);
			F8.setVisible(true);
			q.addActionListener(new R());
			w.addActionListener(new R());
			e.addActionListener(new R());
			r.addActionListener(new R());
			t.addActionListener(new R());
			q1.addActionListener(new R());
			w1.addActionListener(new R());
			e1.addActionListener(new R());
			r1.addActionListener(new R());
			t1.addActionListener(new R());
			q2.addActionListener(new R());
			w2.addActionListener(new R());
			e2.addActionListener(new R());
			r2.addActionListener(new R());
			t2.addActionListener(new R());
		}
		else
			if(m.getSource()== H.BB)
		{
			//H.F4.setVisible(false);
		JFrame F9=new JFrame("Rooms Available");
            L4=new JLabel("BH2 Block-B Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-B");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-B");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-B");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-B");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-B");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-B");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-B");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-B");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-B");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-B");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-B");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-B");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-B");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-B");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-B");
		    t2.setBounds(730,470,70,70);
			F9.setLayout(null);
			F9.add(L4);
			F9.add(L1);
			F9.add(L2);
			F9.add(L3);
			F9.add(q);
			F9.add(w);
			F9.add(e);
			F9.add(r);
			F9.add(t);
			F9.add(q1);
			F9.add(w1);
			F9.add(e1);
			F9.add(r1);
			F9.add(t1);
			F9.add(q2);
			F9.add(w2);
			F9.add(e2);
			F9.add(r2);
			F9.add(t2);
			F9.setSize(1300,700);
			F9.setVisible(true);
			q.addActionListener(new S());
			w.addActionListener(new S());
			e.addActionListener(new S());
			r.addActionListener(new S());
			t.addActionListener(new S());
			q1.addActionListener(new S());
			w1.addActionListener(new S());
			e1.addActionListener(new S());
			r1.addActionListener(new S());
			t1.addActionListener(new S());
			q2.addActionListener(new S());
			w2.addActionListener(new S());
			e2.addActionListener(new S());
			r2.addActionListener(new S());
			t2.addActionListener(new S());
		}
		else
			if(m.getSource()== H.Ga)
		{
			//H.F4.setVisible(false);
		JFrame F15=new JFrame("Rooms Available");
            L4=new JLabel("GH1 Block-A Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-A");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-A");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-A");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-A");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-A");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-A");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-A");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-A");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-A");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-A");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-A");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-A");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-A");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-A");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-A");
		    t2.setBounds(730,470,70,70);
			F15.setLayout(null);
			F15.add(L4);
			F15.add(L1);
			F15.add(L2);
			F15.add(L3);
			F15.add(q);
			F15.add(w);
			F15.add(e);
			F15.add(r);
			F15.add(t);
			F15.add(q1);
			F15.add(w1);
			F15.add(e1);
			F15.add(r1);
			F15.add(t1);
			F15.add(q2);
			F15.add(w2);
			F15.add(e2);
			F15.add(r2);
			F15.add(t2);
			F15.setSize(1300,700);
			F15.setVisible(true);
			q.addActionListener(new T());
			w.addActionListener(new T());
			e.addActionListener(new T());
			r.addActionListener(new T());
			t.addActionListener(new T());
			q1.addActionListener(new T());
			w1.addActionListener(new T());
			e1.addActionListener(new T());
			r1.addActionListener(new T());
			t1.addActionListener(new T());
			q2.addActionListener(new T());
			w2.addActionListener(new T());
			e2.addActionListener(new T());
			r2.addActionListener(new T());
			t2.addActionListener(new T());
		}
		else
			if(m.getSource()== H.GB)
		{
			//H.F4.setVisible(false);
		JFrame F25=new JFrame("Rooms Available");
            L4=new JLabel("GH1 Block-B Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-B");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-B");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-B");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-B");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-B");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-B");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-B");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-B");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-B");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-B");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-B");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-B");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-B");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-B");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-B");
		    t2.setBounds(730,470,70,70);
			F25.setLayout(null);
			F25.add(L4);
			F25.add(L1);
			F25.add(L2);
			F25.add(L3);
			F25.add(q);
			F25.add(w);
			F25.add(e);
			F25.add(r);
			F25.add(t);
			F25.add(q1);
			F25.add(w1);
			F25.add(e1);
			F25.add(r1);
			F25.add(t1);
			F25.add(q2);
			F25.add(w2);
			F25.add(e2);
			F25.add(r2);
			F25.add(t2);
			F25.setSize(1300,700);
			F25.setVisible(true);
			q.addActionListener(new U());
			w.addActionListener(new U());
			e.addActionListener(new U());
			r.addActionListener(new U());
			t.addActionListener(new U());
			q1.addActionListener(new U());
			w1.addActionListener(new U());
			e1.addActionListener(new U());
			r1.addActionListener(new U());
			t1.addActionListener(new U());
			q2.addActionListener(new U());
			w2.addActionListener(new U());
			e2.addActionListener(new U());
			r2.addActionListener(new U());
			t2.addActionListener(new U());
		}
		
		else
			if(m.getSource()== H.Gaa)
		{
			//H.F4.setVisible(false);
		    JFrame F45=new JFrame("Rooms Available");
            L4=new JLabel("GH2 Block-A Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-A");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-A");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-A");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-A");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-A");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-A");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-A");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-A");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-A");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-A");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-A");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-A");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-A");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-A");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-A");
		    t2.setBounds(730,470,70,70);
			F5.setLayout(null);
			F45.add(L4);
			F45.add(L1);
			F45.add(L2);
			F45.add(L3);
			F45.add(q);
			F45.add(w);
			F45.add(e);
			F45.add(r);
			F45.add(t);
			F45.add(q1);
			F45.add(w1);
			F45.add(e1);
			F45.add(r1);
			F45.add(t1);
			F45.add(q2);
			F45.add(w2);
			F45.add(e2);
			F45.add(r2);
			F45.add(t2);
			F45.setSize(1300,700);
			F45.setVisible(true);
			q.addActionListener(new V());
			w.addActionListener(new V());
			e.addActionListener(new V());
			r.addActionListener(new V());
			t.addActionListener(new V());
			q1.addActionListener(new V());
			w1.addActionListener(new V());
			e1.addActionListener(new V());
			r1.addActionListener(new V());
			t1.addActionListener(new V());
			q2.addActionListener(new V());
			w2.addActionListener(new V());
			e2.addActionListener(new V());
			r2.addActionListener(new V());
			t2.addActionListener(new V());
		}
		else
			if(m.getSource()== H.GBB)
		{
			//H.F4.setVisible(false);
		JFrame F55=new JFrame("Rooms Available");
            L4=new JLabel("GH2 Block-B Staff Welcomes You.");
            L4.setBounds(400,100,800,40);
            L4.setFont(font5);
			
			
			
			
			
			L1=new JLabel("Level-1");
			L1.setBounds(400,300,50,15);
			L2=new JLabel("Level-2");
			L2.setBounds(400,400,50,15);
			L3=new JLabel("Level-3");
			L3.setBounds(400,500,50,15);
			q=new JButton("101-B");
		    q.setBounds(450,270,70,70);
			w=new JButton("102-B");
		    w.setBounds(520,270,70,70);
			e=new JButton("103-B");
		    e.setBounds(590,270,70,70);
			r=new JButton("104-B");
		    r.setBounds(660,270,70,70);
			t=new JButton("105-B");
		    t.setBounds(730,270,70,70);
			q1=new JButton("201-B");
		    q1.setBounds(450,370,70,70);
			w1=new JButton("202-B");
		    w1.setBounds(520,370,70,70);
			e1=new JButton("203-B");
		    e1.setBounds(590,370,70,70);
			r1=new JButton("204-B");
		    r1.setBounds(660,370,70,70);
			t1=new JButton("205-B");
		    t1.setBounds(730,370,70,70);
			q2=new JButton("301-B");
		    q2.setBounds(450,470,70,70);
			w2=new JButton("302-B");
		    w2.setBounds(520,470,70,70);
			e2=new JButton("303-B");
		    e2.setBounds(590,470,70,70);
			r2=new JButton("304-B");
		    r2.setBounds(660,470,70,70);
			t2=new JButton("305-B");
		    t2.setBounds(730,470,70,70);
			F55.setLayout(null);
			F55.add(L4);
			F55.add(L1);
			F55.add(L2);
			F55.add(L3);
			F55.add(q);
			F55.add(w);
			F55.add(e);
			F55.add(r);
			F55.add(t);
			F55.add(q1);
			F55.add(w1);
			F55.add(e1);
			F55.add(r1);
			F55.add(t1);
			F55.add(q2);
			F55.add(w2);
			F55.add(e2);
			F55.add(r2);
			F55.add(t2);
			F55.setSize(1300,700);
			F55.setVisible(true);
			q.addActionListener(new W());
			w.addActionListener(new W());
			e.addActionListener(new W());
			r.addActionListener(new W());
			t.addActionListener(new W());
			q1.addActionListener(new W());
			w1.addActionListener(new W());
			e1.addActionListener(new W());
			r1.addActionListener(new W());
			t1.addActionListener(new W());
			q2.addActionListener(new W());
			w2.addActionListener(new W());
			e2.addActionListener(new W());
			r2.addActionListener(new W());
			t2.addActionListener(new W());
		}
		
	}
}
class P implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent p)
	{
                   
try
			{	
	if(p.getSource()==M.q)
	{
				String im2="select status from bh1 where room='101-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='101-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{ 
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(p.getSource()==M.w)
	{
				String im2="select status from bh1 where room='102-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='102-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.e)
	{
				String im2="select status from bh1 where room='103-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='103-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.r)
	{
				String im2="select status from bh1 where room='104-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='104-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.t)
	{
				String im2="select status from bh1 where room='105-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='105-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//level 2
if(p.getSource()==M.q1)
	{
				String im2="select status from bh1 where room='201-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='201-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(p.getSource()==M.w1)
	{
				String im2="select status from bh1 where room='202-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='202-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.e1)
	{
				String im2="select status from bh1 where room='203-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='203-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.r1)
	{
				String im2="select status from bh1 where room='204-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='204-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.t1)
	{
				String im2="select status from bh1 where room='205-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='205-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//Level 3
if(p.getSource()==M.q2)
	{
				String im2="select status from bh1 where room='301-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='301-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(p.getSource()==M.w2)
	{
				String im2="select status from bh1 where room='302-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='302-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.e2)
	{
				String im2="select status from bh1 where room='303-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='303-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.r2)
	{
				String im2="select status from bh1 where room='304-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='304-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(p.getSource()==M.t2)
	{
				String im2="select status from bh1 where room='305-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1 set status=1 where room='305-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	//////////////////////////////////////////////////
			
			}	
			
			catch(Exception g)
			{
				System.out.println(g);
			}
		
		
	}	
}
// BH1 Block B event
class Q implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent qq)
	{
		try
		{
			if(qq.getSource()==M.q)
	{
				String im2="select status from bh1b where room='101-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='101-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(qq.getSource()==M.w)
	{
				String im2="select status from bh1b where room='102-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='102-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.e)
	{
				String im2="select status from bh1b where room='103-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='103-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.r)
	{
				String im2="select status from bh1b where room='104-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='104-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.t)
	{
				String im2="select status from bh1b where room='105-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='105-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//level 2
if(qq.getSource()==M.q1)
	{
				String im2="select status from bh1b where room='201-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='201-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(qq.getSource()==M.w1)
	{
				String im2="select status from bh1b where room='202-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='202-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.e1)
	{
				String im2="select status from bh1b where room='203-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='203-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.r1)
	{
				String im2="select status from bh1b where room='204-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='204-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.t1)
	{
				String im2="select status from bh1b where room='205-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='205-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//Level 3
if(qq.getSource()==M.q2)
	{
				String im2="select status from bh1b where room='301-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='301-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(qq.getSource()==M.w2)
	{
				String im2="select status from bh1b where room='302-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='302-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.e2)
	{
				String im2="select status from bh1b where room='303-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='303-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.r2)
	{
				String im2="select status from bh1b where room='304-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='304-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(qq.getSource()==M.t2)
	{
				String im2="select status from bh1b where room='305-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh1b set status=1 where room='305-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
		}
		catch(Exception gg)
		{
			System.out.println(gg);
		}
	}
}
class R implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent rr)
	{
		try
		{
		if(rr.getSource()==M.q)
	{
				String im2="select status from bh2 where room='101-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='101-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
	if(rr.getSource()==M.w)
	{
				String im2="select status from bh2 where room='102-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='102-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.e)
	{
				String im2="select status from bh2 where room='103-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='103-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.r)
	{
				String im2="select status from bh2 where room='104-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='104-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.t)
	{
				String im2="select status from bh2 where room='105-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='105-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
//level 2
if(rr.getSource()==M.q1)
	{
				String im2="select status from bh2 where room='201-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='201-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
	if(rr.getSource()==M.w1)
	{
				String im2="select status from bh2 where room='202-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='202-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.e1)
	{
				String im2="select status from bh2 where room='203-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='203-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.r1)
	{
				String im2="select status from bh2 where room='204-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='204-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.t1)
	{
				String im2="select status from bh2 where room='205-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='205-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
//Level 3
if(rr.getSource()==M.q2)
	{
				String im2="select status from bh2 where room='301-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='301-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
	if(rr.getSource()==M.w2)
	{
				String im2="select status from bh2 where room='302-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='302-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.e2)
	{
				String im2="select status from bh2 where room='303-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='303-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.r2)
	{
				String im2="select status from bh2 where room='304-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='304-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}
	else
		if(rr.getSource()==M.t2)
	{
				String im2="select status from bh2 where room='305-A'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2 set status=1 where room='305-A'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Aeen Aooked.");
	}
	
	
	}	
		}
		catch(Exception gg1)
		{
			System.out.println(gg1);
		}
	}
}
class S implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent ss)
	{
		try
		{
			if(ss.getSource()==M.q)
	{
				String im2="select status from bh2b where room='101-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='101-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(ss.getSource()==M.w)
	{
				String im2="select status from bh2b where room='102-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='102-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.e)
	{
				String im2="select status from bh2b where room='103-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='103-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.r)
	{
				String im2="select status from bh2b where room='104-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='104-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.t)
	{
				String im2="select status from bh2b where room='105-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='105-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//level 2
if(ss.getSource()==M.q1)
	{
				String im2="select status from bh2b where room='201-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='201-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(ss.getSource()==M.w1)
	{
				String im2="select status from bh2b where room='202-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='202-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.e1)
	{
				String im2="select status from bh2b where room='203-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='203-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.r1)
	{
				String im2="select status from bh2b where room='204-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='204-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.t1)
	{
				String im2="select status from bh2b where room='205-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='205-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
//Level 3
if(ss.getSource()==M.q2)
	{
				String im2="select status from bh2b where room='301-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='301-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
	if(ss.getSource()==M.w2)
	{
				String im2="select status from bh2b where room='302-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='302-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.e2)
	{
				String im2="select status from bh2b where room='303-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='303-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.r2)
	{
				String im2="select status from bh2b where room='304-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='304-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room is already Been Booked.");
	}
	
	
	}
	else
		if(ss.getSource()==M.t2)
	{
				String im2="select status from bh2b where room='305-B'";
				A.rs=A.st.executeQuery(im2);
			while(A.rs.next())
			{
			cc=A.rs.getInt("status");
			System.out.println(cc);
			} 
			if(cc==0)
	{
			 String in="select status from student where user_id="+E.i+"";
			A.rs=A.st.executeQuery(in);
			while(A.rs.next())
			{
			c=A.rs.getInt("status");
			System.out.println(c);
			}
			if(c==0)
			{
				
				   A.FQ.setVisible(true);
				   
				   String im="update student set status=1 where user_id="+E.i+"";
				   A.st.executeUpdate(im);
				   String imm="update bh2b set status=1 where room='305-B'";
				   A.st.executeUpdate(imm);
				   
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Dear Student You have already booked an another Room.");
			}
    }
	else
	{
		JOptionPane.showMessageDialog(null,"Dear Student This Room Is already Been Booked.");
	}
	
	
	}
		}
		catch(Exception gq)
		{
			System.out.println(gq);
		}
	}
}
class T implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent tt)
	{
		try
		{
			
		}
		catch(Exception qg)
		{
			System.out.println(qg);
		}
	}
}
class U implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent uu)
	{
		try
		{
			
		}
		catch(Exception aq)
		{
			System.out.println(aq);
		}
	}
}
class V implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent vv)
	{
		try
		{
			
		}
		catch(Exception qa)
		{
			System.out.println(qa);
		}
	}
}
class W implements ActionListener
{
	int c,cc;
	public void actionPerformed(ActionEvent ww)
	{
		try
		{
			
		}
		catch(Exception da)
		{
			System.out.println(da);
		}
	}
}

class L implements ActionListener
{
	
	public void actionPerformed(ActionEvent l)
	{
		A.CNF.setEnabled(true);
	 if(l.getSource()==A.CNF)
	 {
		 JOptionPane.showMessageDialog(null,"Your Booking has been confirmed");

	 }
	 if(l.getSource()==A.LGT)
	 {
		 A.F.setVisible(true);
		 A.FQ.setVisible(false);

	 }
	
	}
}