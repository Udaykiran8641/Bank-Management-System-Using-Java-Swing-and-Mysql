package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class SignupTwo extends JFrame implements ActionListener {


    JTextField  panNo  , aadhar;
    JButton next;
    JRadioButton  syes,eyes,sno, eno;
    JComboBox nationality,category,income,occupation,education;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel nation = new JLabel("Nationality: ");
        nation.setFont(new Font("Raleway", Font.BOLD,20));
        nation.setBounds(100,140,130,30);
        add(nation);

        String countryNames[] = {"Select","India","Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};
        // Retrieve the first element (index 0)
        String firstElement = countryNames[0];
        // Sort the remaining elements (excluding the first element)
        String[] Countries = Arrays.copyOfRange(countryNames, 1, countryNames.length);
        Arrays.sort(Countries);
        // Create a new array to hold the sorted elements
        String[] sortedCountries = new String[countryNames.length];
        sortedCountries[0] = firstElement;
        // Copy the sorted elements back into the new array
        System.arraycopy(Countries, 0, sortedCountries, 1, Countries.length);
        // Use sortedcountries array to create JComboBox
        nationality = new JComboBox(sortedCountries);
        nationality.setBounds(300, 140, 400, 30);
        nationality.setBackground(Color.white);
        add(nationality);

        JLabel categorydetails = new JLabel("Category: ");
        categorydetails.setFont(new Font("Raleway", Font.BOLD,20));
        categorydetails.setBounds(100,190,200,30);
        add(categorydetails);

        String valcategory[] = {"Select","General", "OBC","SC","ST","Others","Not Applicable"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);


        JLabel incomedetails = new JLabel("Income: ");//dob text font
        incomedetails.setFont(new Font("Raleway", Font.BOLD,20));
        incomedetails.setBounds(100,240,200,30);
        add(incomedetails);

        String incomecategory[] = {"Select","Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);

        JLabel educationaldetails = new JLabel("Educational ");
        educationaldetails.setFont(new Font("Raleway", Font.BOLD,20));
        educationaldetails.setBounds(100,290,200,30);
        add(educationaldetails);

        JLabel qulificationdetails = new JLabel("Qualification: ");
        qulificationdetails.setFont(new Font("Raleway", Font.BOLD,20));
        qulificationdetails.setBounds(100,315,200,30);
        add(qulificationdetails);

        String educationValues[] = {"Select","Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
        add(education);

        JLabel occupationdetails = new JLabel("Occupation: ");//
        occupationdetails.setFont(new Font("Raleway", Font.BOLD,20));
        occupationdetails.setBounds(100,390,200,30);
        add(occupationdetails);

        String occupationValues[] = {"Select","Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);

        JLabel panNumber = new JLabel("PAN Number: ");//address text
        panNumber.setFont(new Font("Raleway", Font.BOLD,20));
        panNumber.setBounds(100,440,200,30);
        add(panNumber);

        panNo = new JTextField();//panNumber text field
        panNo.setFont(new Font("Raleway",Font.BOLD,14));
        panNo.setBounds(300,440,400,30);
        add(panNo);


        JLabel aadharNumber = new JLabel("Aadhar Number: ");//aadharNumber text
        aadharNumber.setFont(new Font("Raleway", Font.BOLD,20));
        aadharNumber.setBounds(100,490,200,30);
        add(aadharNumber);

        aadhar = new JTextField();//aadharNumber text field
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);


        JLabel seniorCitizen = new JLabel("Senior Citizen: ");//Seniorcitizen text
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD,20));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitzn = new ButtonGroup();
        seniorCitzn.add(syes);
        seniorCitzn.add(sno);

        JLabel existingAccount = new JLabel("Exisiting Account: ");
        existingAccount.setFont(new Font("Raleway", Font.BOLD,20));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingaccount = new ButtonGroup();
        existingaccount.add(eyes);
        existingaccount.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String nation = (String) nationality.getSelectedItem();
        String  categorydetails = (String) category.getSelectedItem();
        String incomedetails = (String) income.getSelectedItem();
        String educationValues = (String) education.getSelectedItem();
        String occupationdetails = (String) occupation.getSelectedItem();
        String seniorCitizen = null;
        if (syes.isSelected()){
            seniorCitizen= "Yes";
        }else if (sno.isSelected()){
            seniorCitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()){
            existingaccount = "No";
        }
        String spanNo = panNo.getText();
        String saadhar = aadhar.getText();


        try{
            if (nation.equals("Select")){
                JOptionPane.showMessageDialog(null,"Nationality is Required");
            }
            else if (categorydetails.equals("Select")){
                JOptionPane.showMessageDialog(null,"Category is Required");
            }else if (incomedetails.equals("Select")){
                JOptionPane.showMessageDialog(null,"Income is Required");
            }else if (incomedetails.equals("Select")){
                JOptionPane.showMessageDialog(null,"Education Details is Required");
            }else if (educationValues.equals("Select")){
                JOptionPane.showMessageDialog(null,"Education details is Required");
            }else if (occupationdetails.equals("Select")){
                JOptionPane.showMessageDialog(null,"Occupation details is Required");
            }else if (spanNo.equals("")){
                JOptionPane.showMessageDialog(null,"Pan is Required");
            }else if (saadhar.equals("")){
                JOptionPane.showMessageDialog(null,"Aadhar is Required");
            }else if (seniorCitizen == null ) {
                JOptionPane.showMessageDialog(null, "Senior Citizen details required");
            }else if (existingaccount == null ) {
                JOptionPane.showMessageDialog(null, "Exixiting Account please fill the respoonse");
            }



            Conn c = new Conn();
               String query = "insert into signuptwo values('"+formno+"', '"+nation+"', '"+categorydetails+"', '"+incomedetails+"','"+educationValues+"','"+occupationdetails+"','"+spanNo+"','"+saadhar+"','"+existingaccount+"','"+seniorCitizen+"')";
                c.s.executeUpdate(query);

                //Signup2 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){

        new SignupTwo("");
    }

}
