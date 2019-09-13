from executionInstruction import *

a = execW2reg("aaa","R5","R1","R2")
b = execWimm("bbb","R6","R7",10)

#fila de execução
execution = []
def testeRetorno(execution,a,b):        
    execution.append(a)
    execution.append(b)
    return execution

#print(a.getInstrName() + a.getRegA()  + a.getRegB() + a.getRegD())

testadora = testeRetorno(execution,a,b)


for x in testadora:
    print(x.getInstrName())