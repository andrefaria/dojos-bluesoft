class FizzBuzz
  
  def print(n)
    x=[]
    n.times {|i|
    x << printNumber(i+1)
    }
    return x     
  end
  
  def printNumber(i)
    if (i == 5)
      x = 'buzz'
    elsif (i == 3)
      x = 'fizz'
    else
      x = (i).to_s
    end
      return x
  end

  
end