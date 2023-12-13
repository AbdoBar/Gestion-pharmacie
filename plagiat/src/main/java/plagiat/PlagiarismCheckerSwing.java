/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plagiat;

import com.plagiarismchecker.api.client.PlagiarismCheckerClient;
import com.plagiarismchecker.api.client.PlagiarismCheckerConfig;
import com.plagiarismchecker.api.client.PlagiarismCheckerResponse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PlagiarismCheckerSwing extends JFrame implements ActionListener {

    private JTextField filePathTextField;
    private JTextArea resultTextArea;

    public PlagiarismCheckerSwing() {
        super("Plagiarism Checker");

        // إنشاء العناصر الرسومية
        JLabel filePathLabel = new JLabel("File Path:");
        filePathTextField = new JTextField(20);
        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        resultTextArea = new JTextArea(10, 20);
        resultTextArea.setEditable(false);

        // إضافة العناصر الرسومية إلى النافذة
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(filePathLabel);
        container.add(filePathTextField);
        container.add(checkButton);
        container.add(resultTextArea);

        // تحديد خصائص النافذة
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new PlagiarismCheckerSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // استدعاء API لفحص الانتحال
        PlagiarismCheckerClient client = new PlagiarismCheckerClient(new PlagiarismCheckerConfig("YOUR_API_KEY"));
        File file = new File(filePathTextField.getText());
        PlagiarismCheckerResponse response = client.check(file);

        // عرض نتيجة الفحص
        resultTextArea.setText(response.getResult().toString());
    }
}