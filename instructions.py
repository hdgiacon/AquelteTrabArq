def add(regD,regA,regB):
    regD = regA + regB
    return regD

def sub(regD,regA,regB):
    regD = regA - regB
    return regD

def addi(regD,regA,imm):
    regA += imm
    regD = regA
    return regD

def subi(reD,regA,imm):
    regA -= imm
    regD = regA
    return regD

def mov(regD, valor):
    regD = valor
    return regD