def encrypt(rows, msg):
    assert len(msg) % rows == 0
    n = len(msg)
    cols = n // rows
    encrypted = ['-'] * n
    for i in range(n):
        col = i % cols
        row = i // cols
        encrypted[col * rows + row] = msg[i]
    return "".join(encrypted)

def decrypt(rows, encrypted):
    assert len(encrypted) % rows == 0
    return encrypt(len(encrypted) // rows, encrypted)

msg = "well done you cracked the cipher here is the password scytale223"
e = encrypt(4,msg)
print(e)
d = decrypt(4,e)
print(d)

