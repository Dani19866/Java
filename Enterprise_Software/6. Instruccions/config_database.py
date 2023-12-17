from pymongo import MongoClient
import datetime

username = "root"
password = "pwd_santos_ca_2023"
year = datetime.datetime.now().year
databases = {
    # "clients": [year, "clients"],
    # "employees": [year],
    # "expenses": [year],
    # "sales": [year],
    # "logs": [year],
    "configuration": ["basic"]
}

# ---------- ---------- ---------- ---------- ----------
# Crear una conexión con MongoDB
client = MongoClient(f'mongodb://{username}:{password}@localhost:27017/')

# Lógica de creación
for database in databases:
    # Obtener y crear database
    current_bd = database
    db = client[current_bd.upper()]
    
    # Obtener y crear colección
    collections = databases.get(database)
    for current_collection in collections:
        collection = db[str(current_collection).upper()]
        collection.insert_one({"detail": "success"})


print('Bases de datos y colecciones creadas exitosamente')
input('Presiona ENTER para confirmar...')

# # Crear la base de datos 'CLIENTS' y sus colecciones
# db_clients = client['CLIENTS']
# collection_2024_clients = db_clients['2024']
# collection_clients = db_clients['CLIENTS']

# # Crear la base de datos 'EMPLOYEES' y su colección
# db_employees = client['EMPLOYEES']
# collection_2024_employees = db_employees['2024']

# # Crear la base de datos 'EXPENSES' y su colección
# db_expenses = client['EXPENSES']
# collection_2024_expenses = db_expenses['2024']

# # Crear la base de datos 'SALES' y su colección
# db_sales = client['SALES']
# collection_2024_sales = db_sales['2024']

# # Crear la base de datos 'LOGS' y su colección
# db_logs = clients['LOGS']
# collection_2024_logs = db_logs['2024']

# # Crear la base de datos 'CONFIG' y su colección
# db_ = clients['LOGS']
# collection_2024_logs = db_logs['2024']