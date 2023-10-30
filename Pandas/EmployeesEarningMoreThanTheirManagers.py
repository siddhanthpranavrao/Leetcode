import pandas as pd

def find_employees(employee: pd.DataFrame) -> pd.DataFrame:
    merged_df = employee.merge(right = employee, how = 'left', left_on = 'managerId', right_on = 'id')
    emp = merged_df[merged_df["salary_x"] > merged_df["salary_y"]]["name_x"]
    return pd.DataFrame({'Employee': emp})
    