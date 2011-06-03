require File.expand_path(File.dirname(__FILE__) + '/spec_helper')

describe "FizzBuzz" do

  before do 
      @fz = FizzBuzz.new
  end

  it "should return 1 when 1 is passed" do    
    @fz.print(1).should == ['1']
  end
  
  it "should return [1, 2] when 2 is passed" do    
    @fz.print(2).should == ['1', '2']
  end
  
  it "should return [1, 2, fizz] when 3 is passed" do    
    @fz.print(3).should == ['1', '2', 'fizz']
  end
  
  it "should return [1, 2, fizz, 4] when 4 is passed" do    
    @fz.print(4).should == ['1', '2', 'fizz', '4']
  end 

  it "should return [1, 2, fizz, 4, buzz] when 5 is passed" do
      @fz.print(5).should == ['1', '2', 'fizz', '4', 'buzz']
    end
end