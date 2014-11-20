package starbucks;

import icecekler.Espresso;
import icecekler.Icecek;
import icecekler.KafeinsizKahve;
import icecekler.KarisikKahve;
import icecekler.TurkKahvesi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dekoratorler.Cikolata;
import dekoratorler.DamlaSakizi;
import dekoratorler.Krema;
import dekoratorler.Sut;


public class MainJFrame extends JFrame {
	private JCheckBox Kahve_1,Kahve_2,Kahve_3,Kahve_4,Ek_1,Ek_2,Ek_3,Ek_4;
	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup group;
	private JTextField txtGoster;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFiyat = new JLabel("Fiyat");
		lblFiyat.setBounds(39, 84, 56, 14);
		contentPane.add(lblFiyat);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setForeground(Color.BLACK);
		textField.setBounds(105, 81, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		group=new ButtonGroup();
		
		 Kahve_1 = new JCheckBox("Karýþýk Kahve");
		Kahve_1.setBounds(6, 7, 109, 23);
		contentPane.add(Kahve_1);
		group.add(Kahve_1);
		
		Kahve_2 = new JCheckBox("Turk Kahvesi");
		Kahve_2.setBounds(117, 7, 107, 23);
		contentPane.add(Kahve_2);
		group.add(Kahve_2);
		
		Kahve_3 = new JCheckBox("Kafeinsiz Kahve");
		Kahve_3.setBounds(226, 7, 121, 23);
		contentPane.add(Kahve_3);
		group.add(Kahve_3);
		
		Kahve_4 = new JCheckBox("Expresso");
		Kahve_4.setBounds(349, 7, 97, 23);
		contentPane.add(Kahve_4);
		group.add(Kahve_4);
		
		Ek_1 = new JCheckBox("DamlaSak\u0131zl\u0131");
		Ek_1.setBounds(6, 41, 97, 23);
		contentPane.add(Ek_1);
		
	    Ek_2 = new JCheckBox("Cikolatal\u0131");
		Ek_2.setBounds(117, 41, 97, 23);
		contentPane.add(Ek_2);
		
		Ek_3 = new JCheckBox("Sutlu");
		Ek_3.setBounds(226, 41, 97, 23);
		contentPane.add(Ek_3);
		
		Ek_4 = new JCheckBox("Kremal\u0131");
		Ek_4.setBounds(349, 41, 97, 23);
		contentPane.add(Ek_4);

		txtGoster = new JTextField();
		txtGoster.setText("");
		txtGoster.setBounds(6, 109, 462, 20);
		contentPane.add(txtGoster);
		txtGoster.setColumns(10);
		
		JButton btnKayfe = new JButton("Sipari\u015F Ver");
		btnKayfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Icecek icecek = null;
				Boolean kontrol = false;
				if(Kahve_1.isSelected()){
					icecek = new KarisikKahve();
					txtGoster.setText(" Karýsýk Kahve ");
					textField.setText(Double.toString(icecek.fiyatHesapla()));
					kontrol = true;
					
					
				}
				if(Kahve_2.isSelected()){
					
					icecek = new TurkKahvesi();
					txtGoster.setText(" Turk Kahve ");
					textField.setText(Double.toString(icecek.fiyatHesapla()));
					kontrol = true;
					
				}
				if(Kahve_3.isSelected()){
					
					icecek = new KafeinsizKahve();
					txtGoster.setText(" Kafeinsiz Kahve ");
					textField.setText(Double.toString(icecek.fiyatHesapla()));
					kontrol = true;
				}
				if(Kahve_4.isSelected()){
					
					icecek = new Espresso();
					txtGoster.setText(" Espresso ");
					textField.setText(Double.toString(icecek.fiyatHesapla()));
					kontrol = true;
					
				}
				if(kontrol == true){
					if(Ek_1.isSelected()){
						icecek = new DamlaSakizi(icecek);
						txtGoster.setText(txtGoster.getText().toString()+" Damla Sakýz ");
						textField.setText(Double.toString(icecek.fiyatHesapla()));
					}
					if(Ek_2.isSelected()){
						icecek = new Cikolata(icecek);
						txtGoster.setText(txtGoster.getText().toString()+" Cikolatalý ");
						textField.setText(Double.toString(icecek.fiyatHesapla()));
					}
					if(Ek_3.isSelected()){
					
						icecek = new Sut(icecek);
						txtGoster.setText(txtGoster.getText().toString()+" Sutlu ");
						textField.setText(Double.toString(icecek.fiyatHesapla()));
					}
					
					if(Ek_4.isSelected()){
					
						icecek = new Krema(icecek);
						txtGoster.setText(txtGoster.getText().toString()+" Kremalý ");
						textField.setText(Double.toString(icecek.fiyatHesapla()));
					}
					txtGoster.setText(txtGoster.getText().toString()+"[Sipariþiniz alýndý]"	);
				}
				else
					txtGoster.setText(" Kahve Seçiniz "); 
				
			}
		});
		
		btnKayfe.setBounds(304, 80, 120, 23);
		contentPane.add(btnKayfe);
		
	}
}
