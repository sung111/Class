using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        double num1 = 0; // 첫번째 숫자
        
        string op = null;

        List<double> list = new List<double>();
        List<double> oplist = new List<double>();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            display.Text = "경민 변환 완료 ㅋ";
        }

        private void Form1_Click(object sender, EventArgs e)
        {
            
        }

        private void Form1_BackgroundImageChanged(object sender, EventArgs e)
        {
            BackgroundImage = null;
        }

        private void button1_Click_1(object sender, EventArgs e)
        {

        }

        private void label1_Click_1(object sender, EventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button1_Click_2(object sender, EventArgs e)
        {
            display.Text += "7";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            display.Text += "4";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button12_Click(object sender, EventArgs e)
        {
            this.num1 = double.Parse(display.Text);
            this.op = "-";
            display.Text = "0";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            this.num1 = double.Parse(display.Text);
            this.op = "*";
            display.Text = "0";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            this.num1 = double.Parse(display.Text);
            this.op = "/";
            display.Text = "0";
        }


        private void button16_Click(object sender, EventArgs e)
        {
            this.num1 = double.Parse(display.Text);
            this.op = "+";
            display.Text = "0";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            display.Text += "1";
            // 지금까지 적은 숫자 저장
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            // 연산자 저장
            this.op = "+";
            display.Text = ""+num;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            display.Text += "2";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            display.Text += "3";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            display.Text += "5";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            display.Text += "6";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button8_Click_1(object sender, EventArgs e)
        {
            display.Text += "8";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button9_Click_1(object sender, EventArgs e)
        {
            display.Text += "9";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button10_Click(object sender, EventArgs e)
        {
            display.Text += "0";
            double num = double.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        //bool hasDot = false;
        private void button15_Click(object sender, EventArgs e)
        {
            //if (!hasDot)
            //{
            //    display.Text += ".";
            //    hasDot = true;
            //}
            if (display.Text.IndexOf(".") == -1)
            {
                display.Text += ".";
            }
        }

        private void button17_Click(object sender, EventArgs e)
        {
            double num = double.Parse(display.Text);
            if (op != null)
            {
                double result = 0;
                if("+".Equals(op))
                {
                    result = this.num1 + num;
                }else if ("-".Equals(op))
                {
                    result= this.num1 - num;
                }else if ("*".Equals(op))
                {
                    result= this.num1 * num;
                }else if ("/".Equals(op))
                {
                    result= this.num1 / num;
                }

                //display.Text = "" + result;
                display.Text = result.ToString();

                // 마지막넣은 숫자를 기억해서
                // 다시 = 을 눌렀을때 반복
                //this.num1 = num;
            }
            
        }

        private void button13_Click(object sender, EventArgs e)
        {
            this.num1 = 0;
            this.op = null;
            display.Text = "0";
        }
    }
}
