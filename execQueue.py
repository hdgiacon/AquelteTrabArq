class executionInstruction:
    def __init__(self,instrName,imm,regD,regA,regB):
        self.instrName = instrName
        self.imm = imm
        self.regD = regD
        self.regA = regA
        self.regB = regB

    def setInstrName(self,instrName):
        self.instrName = instrName
    
    def getInstrName(self):
        return self.instrName
    
    def setImm(self,imm):
        self.imm = imm
    
    def getImm(self):
        return self.imm

    def setRegD(self,regD):
        self.regD = regD
    
    def getRegD(self):
        return self.regD

    def setRegA(self,regA):
        self.regA = regA
    
    def getRegA(self):
        return self.regA

    def setRegB(self,regB):
        self.regB = regB
    
    def getRegB(self):
        return self.regB


#criar uma fila da classe criada e depois preencher conforme o fluxo do simulador