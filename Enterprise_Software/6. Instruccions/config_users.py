from pymongo import MongoClient

# Information
username = "root"
password = "pwd_santos_ca_2023"

# Crear una conexión con MongoDB
client = MongoClient('mongodb://localhost:27017/')

# Seleccionar la base de datos 'admin'
db = client['admin']

# Crear el usuario
db.command("createUser", username, pwd=password, roles=["userAdminAnyDatabase", "dbAdminAnyDatabase", "readWriteAnyDatabase"])

print('Usuario creado exitosamente')

# Solicitar una entrada del usuario para confirmar
input('Presiona ENTER para confirmar...')