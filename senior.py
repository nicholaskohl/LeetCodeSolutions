class Solution(object):
    def countSeniors(self,details):
        counter = 0
        for detail in details:
            age = int(detail[11:13])
            if age > 60:
                counter += 1 
        return counter
